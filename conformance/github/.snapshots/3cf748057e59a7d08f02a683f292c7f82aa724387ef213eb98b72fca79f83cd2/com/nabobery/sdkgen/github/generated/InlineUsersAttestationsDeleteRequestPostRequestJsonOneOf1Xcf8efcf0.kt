package com.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/paths/~1users~1{username}~1attestations~1delete-request/post/requestBody/content/applic
 * ation~1json/schema/oneOf/0.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1users~1{username}~1attestations~1delete-request/post/requestBody/content/applic
 * ation~1json/schema/oneOf/0
 */
@Serializable(with = InlineUsersAttestationsDeleteRequestPostRequestJsonOneOf1Xcf8efcf0.Serializer::class)
public class InlineUsersAttestationsDeleteRequestPostRequestJsonOneOf1Xcf8efcf0(
  subjectDigests: List<String>,
) {
  /**
   * List of subject digests associated with the artifact attestations to delete.
   */
  public val subjectDigests: List<String> = subjectDigests.toList()

  public class Builder {
    private var subjectDigestsValue: List<String>? = null

    public var subjectDigests: List<String>
      get() = requireNotNull(subjectDigestsValue) { "subjectDigests is required" }
      set(`value`) {
        subjectDigestsValue = value
      }

    public fun build(): InlineUsersAttestationsDeleteRequestPostRequestJsonOneOf1Xcf8efcf0 {
      check(subjectDigestsValue != null) { "subjectDigests is required" }
      return InlineUsersAttestationsDeleteRequestPostRequestJsonOneOf1Xcf8efcf0(
        subjectDigests = subjectDigests,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineUsersAttestationsDeleteRequestPostRequestJsonOneOf1Xcf8efcf0 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineUsersAttestationsDeleteRequestPostRequestJsonOneOf1Xcf8efcf0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineUsersAttestationsDeleteRequestPostRequestJsonOneOf1Xcf8efcf0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineUsersAttestationsDeleteRequestPostRequestJsonOneOf1Xcf8efcf0")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineUsersAttestationsDeleteRequestPostRequestJsonOneOf1Xcf8efcf0 must be a JSON object")
      val subjectDigests = json.decodeRequired<List<String>>(rawObject, "subject_digests")
      return InlineUsersAttestationsDeleteRequestPostRequestJsonOneOf1Xcf8efcf0(
        subjectDigests = subjectDigests,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineUsersAttestationsDeleteRequestPostRequestJsonOneOf1Xcf8efcf0) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineUsersAttestationsDeleteRequestPostRequestJsonOneOf1Xcf8efcf0")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("subject_digests", json.encodeToJsonElement(value.subjectDigests))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineUsersAttestationsDeleteRequestPostRequestJsonOneOf1Xcf8efcf0(block: InlineUsersAttestationsDeleteRequestPostRequestJsonOneOf1Xcf8efcf0.Builder.() -> Unit): InlineUsersAttestationsDeleteRequestPostRequestJsonOneOf1Xcf8efcf0 = InlineUsersAttestationsDeleteRequestPostRequestJsonOneOf1Xcf8efcf0.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineUsersAttestationsDeleteRequestPostRequestJsonOneOf1Xcf8efcf0 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
