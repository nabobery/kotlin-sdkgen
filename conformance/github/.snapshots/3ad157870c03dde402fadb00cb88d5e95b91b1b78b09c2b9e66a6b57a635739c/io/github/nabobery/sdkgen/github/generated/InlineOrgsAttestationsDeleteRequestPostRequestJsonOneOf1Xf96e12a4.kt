package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1attestations~1delete-request/post/requestBody/content/application~
 * 1json/schema/oneOf/0.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1attestations~1delete-request/post/requestBody/content/application~
 * 1json/schema/oneOf/0
 */
@Serializable(with = InlineOrgsAttestationsDeleteRequestPostRequestJsonOneOf1Xf96e12a4.Serializer::class)
public class InlineOrgsAttestationsDeleteRequestPostRequestJsonOneOf1Xf96e12a4(
  subjectDigests: List<String>,
) {
  /**
   * List of subject digests associated with the artifact attestations to delete.
   */
  public val subjectDigests: List<String> = subjectDigests.toList()

  public class Builder {
    private var subjectDigestsValue: List<String>? = null

    public var subjectDigests: List<String>
      get() = requireNotNull(subjectDigestsValue) { "subjectDigests is required" }.toList()
      set(`value`) {
        subjectDigestsValue = value.toList()
      }

    public fun build(): InlineOrgsAttestationsDeleteRequestPostRequestJsonOneOf1Xf96e12a4 {
      check(subjectDigestsValue != null) { "subjectDigests is required" }
      return InlineOrgsAttestationsDeleteRequestPostRequestJsonOneOf1Xf96e12a4(
        subjectDigests = subjectDigests,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsAttestationsDeleteRequestPostRequestJsonOneOf1Xf96e12a4 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsAttestationsDeleteRequestPostRequestJsonOneOf1Xf96e12a4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsAttestationsDeleteRequestPostRequestJsonOneOf1Xf96e12a4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsAttestationsDeleteRequestPostRequestJsonOneOf1Xf96e12a4")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsAttestationsDeleteRequestPostRequestJsonOneOf1Xf96e12a4 must be a JSON object")
      val subjectDigests = json.decodeRequired<List<String>>(rawObject, "subject_digests")
      return InlineOrgsAttestationsDeleteRequestPostRequestJsonOneOf1Xf96e12a4(
        subjectDigests = subjectDigests,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsAttestationsDeleteRequestPostRequestJsonOneOf1Xf96e12a4) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsAttestationsDeleteRequestPostRequestJsonOneOf1Xf96e12a4")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("subject_digests", json.encodeToJsonElement(value.subjectDigests))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsAttestationsDeleteRequestPostRequestJsonOneOf1Xf96e12a4(block: InlineOrgsAttestationsDeleteRequestPostRequestJsonOneOf1Xf96e12a4.Builder.() -> Unit): InlineOrgsAttestationsDeleteRequestPostRequestJsonOneOf1Xf96e12a4 = InlineOrgsAttestationsDeleteRequestPostRequestJsonOneOf1Xf96e12a4.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsAttestationsDeleteRequestPostRequestJsonOneOf1Xf96e12a4 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
