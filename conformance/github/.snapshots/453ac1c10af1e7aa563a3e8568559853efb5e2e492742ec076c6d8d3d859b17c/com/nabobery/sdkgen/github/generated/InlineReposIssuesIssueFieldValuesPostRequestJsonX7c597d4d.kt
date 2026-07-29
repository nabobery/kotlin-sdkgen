package com.nabobery.sdkgen.github.generated

import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1issues~1{issue_number}~1issue-field-values/post/request
 * Body/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1issues~1{issue_number}~1issue-field-values/post/request
 * Body/content/application~1json/schema
 */
@Serializable(with = InlineReposIssuesIssueFieldValuesPostRequestJsonX7c597d4d.Serializer::class)
public class InlineReposIssuesIssueFieldValuesPostRequestJsonX7c597d4d(
  issueFieldValues: List<InlineReposIssuesIssueFieldValuesPostRequestJsonIssueFieldValuesItemX6923dbee>? = null,
) {
  /**
   * An array of issue field values to add to this issue. Each field value must include the field ID and the value to
   * set.
   */
  public val issueFieldValues:
      List<InlineReposIssuesIssueFieldValuesPostRequestJsonIssueFieldValuesItemX6923dbee>? =
      issueFieldValues?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var issueFieldValuesValue:
        List<InlineReposIssuesIssueFieldValuesPostRequestJsonIssueFieldValuesItemX6923dbee>? = null

    /**
     * An array of issue field values to add to this issue. Each field value must include the field ID and the value to
     * set.
     */
    public var issueFieldValues:
        List<InlineReposIssuesIssueFieldValuesPostRequestJsonIssueFieldValuesItemX6923dbee>?
      get() = issueFieldValuesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        issueFieldValuesValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineReposIssuesIssueFieldValuesPostRequestJsonX7c597d4d = InlineReposIssuesIssueFieldValuesPostRequestJsonX7c597d4d(
      issueFieldValues = issueFieldValues,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposIssuesIssueFieldValuesPostRequestJsonX7c597d4d = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineReposIssuesIssueFieldValuesPostRequestJsonX7c597d4d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposIssuesIssueFieldValuesPostRequestJsonX7c597d4d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposIssuesIssueFieldValuesPostRequestJsonX7c597d4d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposIssuesIssueFieldValuesPostRequestJsonX7c597d4d must be a JSON object")
      return InlineReposIssuesIssueFieldValuesPostRequestJsonX7c597d4d(
        issueFieldValues = rawObject["issue_field_values"]?.let { json.decodeFromJsonElement<List<InlineReposIssuesIssueFieldValuesPostRequestJsonIssueFieldValuesItemX6923dbee>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposIssuesIssueFieldValuesPostRequestJsonX7c597d4d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposIssuesIssueFieldValuesPostRequestJsonX7c597d4d")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.issueFieldValues?.let { put("issue_field_values", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposIssuesIssueFieldValuesPostRequestJsonX7c597d4d(block: InlineReposIssuesIssueFieldValuesPostRequestJsonX7c597d4d.Builder.() -> Unit): InlineReposIssuesIssueFieldValuesPostRequestJsonX7c597d4d = InlineReposIssuesIssueFieldValuesPostRequestJsonX7c597d4d.build(block)
