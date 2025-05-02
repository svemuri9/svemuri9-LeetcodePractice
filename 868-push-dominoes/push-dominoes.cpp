class Solution {
public:
	string pushDominoes(string dominoes) {
		vector<char> arr(dominoes.begin(), dominoes.end());
		int low = 0, high = arr.size()-1;

		if (arr[low] == '.'){
			for (int i = 0; i < arr.size(); i++){
				if (arr[i] == 'R'){
					low = i;
					break;
				}

				if (arr[i] == 'L'){
					for (int j = 0; j < i; j++) arr[j] = 'L';
					break;
				}      
			}
		}
		if (arr[high] == '.')
			for (int i = arr.size()-1; i > -1; i--){
				if (arr[i] == 'L'){
					high = i;
					break;
				}
				if (arr[i] == 'R'){
					for (int j=i; j<arr.size();j++) arr[j] = 'R';
					break;
				}
			}

		int i = low;
		for (int j = low+1; j<high+1; j++){
			if (arr[i] == 'R' && arr[j] == 'L'){
				int mid = (i+j)/2;
				int temp = j;
				while (i != j){
					if (i >= temp){
						i = j;
						break;
					}
					arr[i] = 'R';
					arr[temp] = 'L';

					temp--;
					i++;   
				}
			}
			if (arr[i] == 'R' && arr[j] == 'R'){
				while (i != j){
					arr[i] = 'R';
					i++;
				}
			}
			if (arr[i] == 'L' && arr[j] == 'L'){
				while (i != j){
					arr[i] = 'L';
					i++;
				}
			}
			if (arr[i] == 'L' && arr[j] == 'R') i = j;

		}

		string result = "";

		for (int i = 0; i < arr.size(); i++) result += arr[i];

		return result;
	}
};