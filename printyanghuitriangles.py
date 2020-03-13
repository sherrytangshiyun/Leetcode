def triangles(max):
   N = [1]
   while len(N)<max:
       yield N
       N.append(0)
       N = [N[i-1]+N[i] for i in range(len(N))]
for n in triangles(10):
      print(n)
# def print_triangles(time):
#     a = 0;
#     for n in triangles():
#         print(n)
#         a = a+1
#         if a == time:
#              break
# print_triangles(10)