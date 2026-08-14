package io.github.nabobery.sdkgen.generated

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
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1organization~1members/get/responses/200/content/application~1json/schema
 */
@Serializable(with = InlineOrganizationMembersGetResponse200JsonX65dd6b8f.Serializer::class)
public class InlineOrganizationMembersGetResponse200JsonX65dd6b8f(
  `data`: List<InlineOrganizationMembersGetResponse200JsonDataItemX43d6a724>,
  /**
   * Total number of members in the organization
   */
  public val totalCount: Int,
) {
  /**
   * List of organization members
   */
  public val `data`: List<InlineOrganizationMembersGetResponse200JsonDataItemX43d6a724> =
      data.toList()

  public class Builder {
    private var dataValue: List<InlineOrganizationMembersGetResponse200JsonDataItemX43d6a724>? =
        null

    public var `data`: List<InlineOrganizationMembersGetResponse200JsonDataItemX43d6a724>
      get() = requireNotNull(dataValue) { "data is required" }.toList()
      set(`value`) {
        dataValue = value.toList()
      }

    private var totalCountValue: Int? = null

    public var totalCount: Int
      get() = requireNotNull(totalCountValue) { "totalCount is required" }
      set(`value`) {
        totalCountValue = value
      }

    public fun build(): InlineOrganizationMembersGetResponse200JsonX65dd6b8f {
      check(dataValue != null) { "data is required" }
      check(totalCountValue != null) { "totalCount is required" }
      return InlineOrganizationMembersGetResponse200JsonX65dd6b8f(
        data = data,
        totalCount = totalCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrganizationMembersGetResponse200JsonX65dd6b8f = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrganizationMembersGetResponse200JsonX65dd6b8f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrganizationMembersGetResponse200JsonX65dd6b8f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrganizationMembersGetResponse200JsonX65dd6b8f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrganizationMembersGetResponse200JsonX65dd6b8f must be a JSON object")
      val data = json.decodeRequired<List<InlineOrganizationMembersGetResponse200JsonDataItemX43d6a724>>(rawObject, "data")
      val totalCount = json.decodeRequired<Int>(rawObject, "total_count")
      return InlineOrganizationMembersGetResponse200JsonX65dd6b8f(
        data = data,
        totalCount = totalCount,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrganizationMembersGetResponse200JsonX65dd6b8f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrganizationMembersGetResponse200JsonX65dd6b8f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", json.encodeToJsonElement(value.data))
        put("total_count", json.encodeToJsonElement(value.totalCount))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrganizationMembersGetResponse200JsonX65dd6b8f(block: InlineOrganizationMembersGetResponse200JsonX65dd6b8f.Builder.() -> Unit): InlineOrganizationMembersGetResponse200JsonX65dd6b8f = InlineOrganizationMembersGetResponse200JsonX65dd6b8f.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrganizationMembersGetResponse200JsonX65dd6b8f is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
