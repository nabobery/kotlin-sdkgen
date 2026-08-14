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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1attestations~1bulk-list/post/requestBody/content/application~1json
 * /schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1attestations~1bulk-list/post/requestBody/content/application~1json
 * /schema
 */
@Serializable(with = InlineOrgsAttestationsBulkListPostRequestJsonX357786df.Serializer::class)
public class InlineOrgsAttestationsBulkListPostRequestJsonX357786df(
  subjectDigests: List<String>,
  /**
   * Optional filter for fetching attestations with a given predicate type.
   * This option accepts `provenance`, `sbom`, `release`, or freeform text
   * for custom predicate types.
   */
  public val predicateType: String? = null,
) {
  /**
   * List of subject digests to fetch attestations for.
   */
  public val subjectDigests: List<String> = subjectDigests.toList()

  public class Builder {
    private var subjectDigestsValue: List<String>? = null

    public var subjectDigests: List<String>
      get() = requireNotNull(subjectDigestsValue) { "subjectDigests is required" }.toList()
      set(`value`) {
        subjectDigestsValue = value.toList()
      }

    /**
     * Optional filter for fetching attestations with a given predicate type.
     * This option accepts `provenance`, `sbom`, `release`, or freeform text
     * for custom predicate types.
     */
    public var predicateType: String? = null

    public fun build(): InlineOrgsAttestationsBulkListPostRequestJsonX357786df {
      check(subjectDigestsValue != null) { "subjectDigests is required" }
      return InlineOrgsAttestationsBulkListPostRequestJsonX357786df(
        subjectDigests = subjectDigests,
        predicateType = predicateType,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsAttestationsBulkListPostRequestJsonX357786df = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsAttestationsBulkListPostRequestJsonX357786df> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsAttestationsBulkListPostRequestJsonX357786df {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsAttestationsBulkListPostRequestJsonX357786df")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsAttestationsBulkListPostRequestJsonX357786df must be a JSON object")
      val subjectDigests = json.decodeRequired<List<String>>(rawObject, "subject_digests")
      return InlineOrgsAttestationsBulkListPostRequestJsonX357786df(
        subjectDigests = subjectDigests,
        predicateType = rawObject["predicate_type"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsAttestationsBulkListPostRequestJsonX357786df) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsAttestationsBulkListPostRequestJsonX357786df")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("subject_digests", json.encodeToJsonElement(value.subjectDigests))
        value.predicateType?.let { put("predicate_type", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsAttestationsBulkListPostRequestJsonX357786df(block: InlineOrgsAttestationsBulkListPostRequestJsonX357786df.Builder.() -> Unit): InlineOrgsAttestationsBulkListPostRequestJsonX357786df = InlineOrgsAttestationsBulkListPostRequestJsonX357786df.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsAttestationsBulkListPostRequestJsonX357786df is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
