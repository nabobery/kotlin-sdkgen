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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1issues~1{issue_number}~1issue-field-values/put/requestB
 * ody/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1issues~1{issue_number}~1issue-field-values/put/requestB
 * ody/content/application~1json/schema
 */
@Serializable(with = InlineReposIssuesIssueFieldValuesPutRequestJsonXb4ea8cdc.Serializer::class)
public class InlineReposIssuesIssueFieldValuesPutRequestJsonXb4ea8cdc(
  issueFieldValues: List<InlineReposIssuesIssueFieldValuesPutRequestJsonIssueFieldValuesItemX6a6ef3bf>? = null,
) {
  /**
   * An array of issue field values to set for this issue. Each field value must include the field ID and the value to
   * set. All existing field values will be replaced.
   */
  public val issueFieldValues:
      List<InlineReposIssuesIssueFieldValuesPutRequestJsonIssueFieldValuesItemX6a6ef3bf>? =
      issueFieldValues?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var issueFieldValuesValue:
        List<InlineReposIssuesIssueFieldValuesPutRequestJsonIssueFieldValuesItemX6a6ef3bf>? = null

    /**
     * An array of issue field values to set for this issue. Each field value must include the field ID and the value to
     * set. All existing field values will be replaced.
     */
    public var issueFieldValues:
        List<InlineReposIssuesIssueFieldValuesPutRequestJsonIssueFieldValuesItemX6a6ef3bf>?
      get() = issueFieldValuesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        issueFieldValuesValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineReposIssuesIssueFieldValuesPutRequestJsonXb4ea8cdc = InlineReposIssuesIssueFieldValuesPutRequestJsonXb4ea8cdc(
      issueFieldValues = issueFieldValues,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposIssuesIssueFieldValuesPutRequestJsonXb4ea8cdc = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposIssuesIssueFieldValuesPutRequestJsonXb4ea8cdc> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposIssuesIssueFieldValuesPutRequestJsonXb4ea8cdc {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposIssuesIssueFieldValuesPutRequestJsonXb4ea8cdc")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposIssuesIssueFieldValuesPutRequestJsonXb4ea8cdc must be a JSON object")
      return InlineReposIssuesIssueFieldValuesPutRequestJsonXb4ea8cdc(
        issueFieldValues = rawObject["issue_field_values"]?.let { json.decodeFromJsonElement<List<InlineReposIssuesIssueFieldValuesPutRequestJsonIssueFieldValuesItemX6a6ef3bf>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposIssuesIssueFieldValuesPutRequestJsonXb4ea8cdc) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposIssuesIssueFieldValuesPutRequestJsonXb4ea8cdc")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.issueFieldValues?.let { put("issue_field_values", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposIssuesIssueFieldValuesPutRequestJsonXb4ea8cdc(block: InlineReposIssuesIssueFieldValuesPutRequestJsonXb4ea8cdc.Builder.() -> Unit): InlineReposIssuesIssueFieldValuesPutRequestJsonXb4ea8cdc = InlineReposIssuesIssueFieldValuesPutRequestJsonXb4ea8cdc.build(block)
