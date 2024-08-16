class Solution {
public:

    int count(int x,vector<int> &a)
    {
        int n=a.size();
        int i=0,j=1;
        int s=0;
        int ans=0;
        for(;j<n;j++)
        {
            s+=a[j]-a[j-1];
            while(i<j && s>x)
             {
                s-=(a[i+1]-a[i]);
                i++;
             }
             
           ans+=(j-i);

        }
        
        return ans;

    }
    int smallestDistancePair(vector<int>& a, int k) {
        
         int n=a.size();
         sort(a.begin(),a.end());
         vector<int> d;
         for(int i=1;i<n;i++){
            d.push_back(a[i]-a[i-1]);
         }
        // sort(d.begin(),d.end());
         int h=a[n-1]-a[0],l=0;
         int ans=h;
        
         
         while(l<=h)
         {
            int m=l+(h-l)/2;
            int x=count(m,a);
            cout<<"x is :: "<<x<<endl;
             cout<<"m is :: "<<m<<endl;
            if(x<k)
            {
                l=m+1;
            }
            else
            {
                h=m-1;
                ans=m;
            }
         }
         
        return ans;

    }
};