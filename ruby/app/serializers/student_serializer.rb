class StudentSerializer < ActiveModel::Serializer
  attributes :id, :name
  belongs_to :classroom
end
