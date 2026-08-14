package io.github.nabobery.sdkgen.github.generated

import kotlin.Boolean
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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1issues~1{issue_number}~1sub_issues/post/requestBody/con
 * tent/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1issues~1{issue_number}~1sub_issues/post/requestBody/con
 * tent/application~1json/schema
 */
@Serializable(with = InlineReposIssuesSubIssuesPostRequestJsonXb97cb5c5.Serializer::class)
public class InlineReposIssuesSubIssuesPostRequestJsonXb97cb5c5(
  /**
   * The id of the sub-issue to add. The sub-issue must belong to the same repository owner as the parent issue
   */
  public val subIssueId: Int,
  /**
   * Option that, when true, instructs the operation to replace the sub-issues current parent issue
   */
  public val replaceParent: Boolean? = null,
) {
  public class Builder {
    private var subIssueIdValue: Int? = null

    public var subIssueId: Int
      get() = requireNotNull(subIssueIdValue) { "subIssueId is required" }
      set(`value`) {
        subIssueIdValue = value
      }

    /**
     * Option that, when true, instructs the operation to replace the sub-issues current parent issue
     */
    public var replaceParent: Boolean? = null

    public fun build(): InlineReposIssuesSubIssuesPostRequestJsonXb97cb5c5 {
      check(subIssueIdValue != null) { "subIssueId is required" }
      return InlineReposIssuesSubIssuesPostRequestJsonXb97cb5c5(
        subIssueId = subIssueId,
        replaceParent = replaceParent,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposIssuesSubIssuesPostRequestJsonXb97cb5c5 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposIssuesSubIssuesPostRequestJsonXb97cb5c5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposIssuesSubIssuesPostRequestJsonXb97cb5c5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposIssuesSubIssuesPostRequestJsonXb97cb5c5")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposIssuesSubIssuesPostRequestJsonXb97cb5c5 must be a JSON object")
      val subIssueId = json.decodeRequired<Int>(rawObject, "sub_issue_id")
      return InlineReposIssuesSubIssuesPostRequestJsonXb97cb5c5(
        subIssueId = subIssueId,
        replaceParent = rawObject["replace_parent"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposIssuesSubIssuesPostRequestJsonXb97cb5c5) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposIssuesSubIssuesPostRequestJsonXb97cb5c5")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("sub_issue_id", json.encodeToJsonElement(value.subIssueId))
        value.replaceParent?.let { put("replace_parent", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposIssuesSubIssuesPostRequestJsonXb97cb5c5(block: InlineReposIssuesSubIssuesPostRequestJsonXb97cb5c5.Builder.() -> Unit): InlineReposIssuesSubIssuesPostRequestJsonXb97cb5c5 = InlineReposIssuesSubIssuesPostRequestJsonXb97cb5c5.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposIssuesSubIssuesPostRequestJsonXb97cb5c5 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
