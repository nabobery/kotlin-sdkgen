package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1attestations~1bulk-list/post/responses/200/content/application~1js
 * on/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1attestations~1bulk-list/post/responses/200/content/application~1js
 * on/schema
 */
@Serializable(with = InlineOrgsAttestationsBulkListPostResponse200JsonX6fc6f110.Serializer::class)
public class InlineOrgsAttestationsBulkListPostResponse200JsonX6fc6f110(
  attestationsSubjectDigests: Map<String, List<InlineOrgsAttestationsBulkListPostResponse200JsonItemXfd4487a4>?>? = null,
  /**
   * Information about the current page.
   */
  public val pageInfo: InlineOrgsAttestationsBulkListPostResponse200JsonPageInfoX580e9f8d? = null,
) {
  /**
   * Mapping of subject digest to bundles.
   */
  public val attestationsSubjectDigests:
      Map<String, List<InlineOrgsAttestationsBulkListPostResponse200JsonItemXfd4487a4>?>? =
      attestationsSubjectDigests?.let { collection0 -> collection0.entries.associate { (key1, mapValue1) -> key1 to mapValue1?.let { collection2 -> collection2.toList() } } }

  public class Builder {
    private var attestationsSubjectDigestsValue:
        Map<String, List<InlineOrgsAttestationsBulkListPostResponse200JsonItemXfd4487a4>?>? = null

    /**
     * Mapping of subject digest to bundles.
     */
    public var attestationsSubjectDigests:
        Map<String, List<InlineOrgsAttestationsBulkListPostResponse200JsonItemXfd4487a4>?>?
      get() = attestationsSubjectDigestsValue?.let { collection0 -> collection0.entries.associate { (key1, mapValue1) -> key1 to mapValue1?.let { collection2 -> collection2.toList() } } }
      set(`value`) {
        attestationsSubjectDigestsValue = value?.let { collection0 -> collection0.entries.associate { (key1, mapValue1) -> key1 to mapValue1?.let { collection2 -> collection2.toList() } } }
      }

    /**
     * Information about the current page.
     */
    public var pageInfo: InlineOrgsAttestationsBulkListPostResponse200JsonPageInfoX580e9f8d? = null

    public fun build(): InlineOrgsAttestationsBulkListPostResponse200JsonX6fc6f110 = InlineOrgsAttestationsBulkListPostResponse200JsonX6fc6f110(
      attestationsSubjectDigests = attestationsSubjectDigests,
      pageInfo = pageInfo,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsAttestationsBulkListPostResponse200JsonX6fc6f110 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsAttestationsBulkListPostResponse200JsonX6fc6f110> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsAttestationsBulkListPostResponse200JsonX6fc6f110 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsAttestationsBulkListPostResponse200JsonX6fc6f110")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsAttestationsBulkListPostResponse200JsonX6fc6f110 must be a JSON object")
      return InlineOrgsAttestationsBulkListPostResponse200JsonX6fc6f110(
        attestationsSubjectDigests = rawObject["attestations_subject_digests"]?.let { json.decodeFromJsonElement<Map<String, List<InlineOrgsAttestationsBulkListPostResponse200JsonItemXfd4487a4>?>>(it) },
        pageInfo = rawObject["page_info"]?.let { json.decodeFromJsonElement<InlineOrgsAttestationsBulkListPostResponse200JsonPageInfoX580e9f8d>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsAttestationsBulkListPostResponse200JsonX6fc6f110) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsAttestationsBulkListPostResponse200JsonX6fc6f110")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.attestationsSubjectDigests?.let { put("attestations_subject_digests", json.encodeToJsonElement(it)) }
        value.pageInfo?.let { put("page_info", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsAttestationsBulkListPostResponse200JsonX6fc6f110(block: InlineOrgsAttestationsBulkListPostResponse200JsonX6fc6f110.Builder.() -> Unit): InlineOrgsAttestationsBulkListPostResponse200JsonX6fc6f110 = InlineOrgsAttestationsBulkListPostResponse200JsonX6fc6f110.build(block)
