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
 * sdkgen://source/openapi.yaml#/paths/~1users~1{username}~1attestations~1bulk-list/post/requestBody/content/application
 * ~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1users~1{username}~1attestations~1bulk-list/post/requestBody/content/application
 * ~1json/schema
 */
@Serializable(with = InlineUsersAttestationsBulkListPostRequestJsonXd1686097.Serializer::class)
public class InlineUsersAttestationsBulkListPostRequestJsonXd1686097(
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

    public fun build(): InlineUsersAttestationsBulkListPostRequestJsonXd1686097 {
      check(subjectDigestsValue != null) { "subjectDigests is required" }
      return InlineUsersAttestationsBulkListPostRequestJsonXd1686097(
        subjectDigests = subjectDigests,
        predicateType = predicateType,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineUsersAttestationsBulkListPostRequestJsonXd1686097 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineUsersAttestationsBulkListPostRequestJsonXd1686097> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineUsersAttestationsBulkListPostRequestJsonXd1686097 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineUsersAttestationsBulkListPostRequestJsonXd1686097")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineUsersAttestationsBulkListPostRequestJsonXd1686097 must be a JSON object")
      val subjectDigests = json.decodeRequired<List<String>>(rawObject, "subject_digests")
      return InlineUsersAttestationsBulkListPostRequestJsonXd1686097(
        subjectDigests = subjectDigests,
        predicateType = rawObject["predicate_type"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineUsersAttestationsBulkListPostRequestJsonXd1686097) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineUsersAttestationsBulkListPostRequestJsonXd1686097")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("subject_digests", json.encodeToJsonElement(value.subjectDigests))
        value.predicateType?.let { put("predicate_type", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineUsersAttestationsBulkListPostRequestJsonXd1686097(block: InlineUsersAttestationsBulkListPostRequestJsonXd1686097.Builder.() -> Unit): InlineUsersAttestationsBulkListPostRequestJsonXd1686097 = InlineUsersAttestationsBulkListPostRequestJsonXd1686097.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineUsersAttestationsBulkListPostRequestJsonXd1686097 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
