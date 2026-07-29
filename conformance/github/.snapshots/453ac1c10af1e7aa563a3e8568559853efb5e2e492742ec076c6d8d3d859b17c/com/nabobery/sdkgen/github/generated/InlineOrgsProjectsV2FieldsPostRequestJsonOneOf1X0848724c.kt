package com.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1projectsV2~1{project_number}~1fields/post/requestBody/content/appl
 * ication~1json/schema/oneOf/0.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1projectsV2~1{project_number}~1fields/post/requestBody/content/appl
 * ication~1json/schema/oneOf/0
 */
@Serializable(with = InlineOrgsProjectsV2FieldsPostRequestJsonOneOf1X0848724c.Serializer::class)
public class InlineOrgsProjectsV2FieldsPostRequestJsonOneOf1X0848724c(
  /**
   * The ID of the IssueField to create the field for.
   */
  public val issueFieldId: Int,
) {
  public class Builder {
    private var issueFieldIdValue: Int? = null

    public var issueFieldId: Int
      get() = requireNotNull(issueFieldIdValue) { "issueFieldId is required" }
      set(`value`) {
        issueFieldIdValue = value
      }

    public fun build(): InlineOrgsProjectsV2FieldsPostRequestJsonOneOf1X0848724c {
      check(issueFieldIdValue != null) { "issueFieldId is required" }
      return InlineOrgsProjectsV2FieldsPostRequestJsonOneOf1X0848724c(
        issueFieldId = issueFieldId,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsProjectsV2FieldsPostRequestJsonOneOf1X0848724c = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineOrgsProjectsV2FieldsPostRequestJsonOneOf1X0848724c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsProjectsV2FieldsPostRequestJsonOneOf1X0848724c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsProjectsV2FieldsPostRequestJsonOneOf1X0848724c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsProjectsV2FieldsPostRequestJsonOneOf1X0848724c must be a JSON object")
      val issueFieldId = json.decodeRequired<Int>(rawObject, "issue_field_id")
      return InlineOrgsProjectsV2FieldsPostRequestJsonOneOf1X0848724c(
        issueFieldId = issueFieldId,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsProjectsV2FieldsPostRequestJsonOneOf1X0848724c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsProjectsV2FieldsPostRequestJsonOneOf1X0848724c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("issue_field_id", json.encodeToJsonElement(value.issueFieldId))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsProjectsV2FieldsPostRequestJsonOneOf1X0848724c(block: InlineOrgsProjectsV2FieldsPostRequestJsonOneOf1X0848724c.Builder.() -> Unit): InlineOrgsProjectsV2FieldsPostRequestJsonOneOf1X0848724c = InlineOrgsProjectsV2FieldsPostRequestJsonOneOf1X0848724c.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsProjectsV2FieldsPostRequestJsonOneOf1X0848724c is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
