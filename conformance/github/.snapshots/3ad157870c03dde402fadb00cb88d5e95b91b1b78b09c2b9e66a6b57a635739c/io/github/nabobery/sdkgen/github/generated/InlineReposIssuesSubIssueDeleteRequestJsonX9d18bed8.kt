package io.github.nabobery.sdkgen.github.generated

import kotlin.Int
import kotlin.String
import kotlin.Unit
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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1issues~1{issue_number}~1sub_issue/delete/requestBody/co
 * ntent/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1issues~1{issue_number}~1sub_issue/delete/requestBody/co
 * ntent/application~1json/schema
 */
@Serializable(with = InlineReposIssuesSubIssueDeleteRequestJsonX9d18bed8.Serializer::class)
public class InlineReposIssuesSubIssueDeleteRequestJsonX9d18bed8(
  /**
   * The id of the sub-issue to remove
   */
  public val subIssueId: Int,
) {
  public class Builder {
    private var subIssueIdValue: Int? = null

    public var subIssueId: Int
      get() = requireNotNull(subIssueIdValue) { "subIssueId is required" }
      set(`value`) {
        subIssueIdValue = value
      }

    public fun build(): InlineReposIssuesSubIssueDeleteRequestJsonX9d18bed8 {
      check(subIssueIdValue != null) { "subIssueId is required" }
      return InlineReposIssuesSubIssueDeleteRequestJsonX9d18bed8(
        subIssueId = subIssueId,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposIssuesSubIssueDeleteRequestJsonX9d18bed8 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposIssuesSubIssueDeleteRequestJsonX9d18bed8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposIssuesSubIssueDeleteRequestJsonX9d18bed8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposIssuesSubIssueDeleteRequestJsonX9d18bed8")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposIssuesSubIssueDeleteRequestJsonX9d18bed8 must be a JSON object")
      val subIssueId = json.decodeRequired<Int>(rawObject, "sub_issue_id")
      return InlineReposIssuesSubIssueDeleteRequestJsonX9d18bed8(
        subIssueId = subIssueId,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposIssuesSubIssueDeleteRequestJsonX9d18bed8) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposIssuesSubIssueDeleteRequestJsonX9d18bed8")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("sub_issue_id", json.encodeToJsonElement(value.subIssueId))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposIssuesSubIssueDeleteRequestJsonX9d18bed8(block: InlineReposIssuesSubIssueDeleteRequestJsonX9d18bed8.Builder.() -> Unit): InlineReposIssuesSubIssueDeleteRequestJsonX9d18bed8 = InlineReposIssuesSubIssueDeleteRequestJsonX9d18bed8.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposIssuesSubIssueDeleteRequestJsonX9d18bed8 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
