package com.nabobery.sdkgen.generated

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1organization~1members/get/responses/200/content/application~1json/schema.
 */
@Serializable(with = InlinePathsOrganizationMembersGetResponses200ContentApplicationJsonSchema.Serializer::class)
public class InlinePathsOrganizationMembersGetResponses200ContentApplicationJsonSchema(
  `data`: List<InlinePathsOrganizationMembersGetResponses200ContentApplicationJsonSchemaPropert43d6a724>,
  /**
   * Total number of members in the organization
   */
  public val totalCount: Int,
) {
  /**
   * List of organization members
   */
  public val `data`:
      List<InlinePathsOrganizationMembersGetResponses200ContentApplicationJsonSchemaPropert43d6a724>
      = data.toList()

  public class Builder {
    private var dataValue:
        List<InlinePathsOrganizationMembersGetResponses200ContentApplicationJsonSchemaPropert43d6a724>?
        = null

    public var `data`:
        List<InlinePathsOrganizationMembersGetResponses200ContentApplicationJsonSchemaPropert43d6a724>
      get() = requireNotNull(dataValue) { "data is required" }
      set(`value`) {
        dataValue = value
      }

    private var totalCountValue: Int? = null

    public var totalCount: Int
      get() = requireNotNull(totalCountValue) { "totalCount is required" }
      set(`value`) {
        totalCountValue = value
      }

    public fun build(): InlinePathsOrganizationMembersGetResponses200ContentApplicationJsonSchema {
      check(dataValue != null) { "data is required" }
      check(totalCountValue != null) { "totalCount is required" }
      return InlinePathsOrganizationMembersGetResponses200ContentApplicationJsonSchema(
        data = data,
        totalCount = totalCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() ->
      Unit): InlinePathsOrganizationMembersGetResponses200ContentApplicationJsonSchema = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlinePathsOrganizationMembersGetResponses200ContentApplicationJsonSchema> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePathsOrganizationMembersGetResponses200ContentApplicationJsonSchema {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlinePathsOrganizationMembersGetResponses200ContentApplicationJsonSchema")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlinePathsOrganizationMembersGetResponses200ContentApplicationJsonSchema must " +
          "be a JSON object")
      val data = json
        .decodeRequired<List<InlinePathsOrganizationMembersGetResponses200ContentApplicationJsonSchemaPropert43d6a724>>(raw, "data")
      val totalCount = json.decodeRequired<Int>(raw, "total_count")
      return InlinePathsOrganizationMembersGetResponses200ContentApplicationJsonSchema(
        data = data,
        totalCount = totalCount,
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlinePathsOrganizationMembersGetResponses200ContentApplicationJsonSchema) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlinePathsOrganizationMembersGetResponses200ContentApplicationJsonSchema")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", json.encodeToJsonElement(value.data))
        put("total_count", json.encodeToJsonElement(value.totalCount))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlinePathsOrganizationMembersGetResponses200ContentApplicationJsonSchema(block: InlinePathsOrganizationMembersGetResponses200ContentApplicationJsonSchema.Builder.() -> Unit): InlinePathsOrganizationMembersGetResponses200ContentApplicationJsonSchema = InlinePathsOrganizationMembersGetResponses200ContentApplicationJsonSchema.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlinePathsOrganizationMembersGetResponses200ContentApplicationJsonSchema is " +
      "missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
