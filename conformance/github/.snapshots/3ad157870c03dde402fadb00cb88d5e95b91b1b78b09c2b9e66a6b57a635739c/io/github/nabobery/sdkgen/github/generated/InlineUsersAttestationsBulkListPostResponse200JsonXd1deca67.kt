package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/paths/~1users~1{username}~1attestations~1bulk-list/post/responses/200/content/applicati
 * on~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1users~1{username}~1attestations~1bulk-list/post/responses/200/content/applicati
 * on~1json/schema
 */
@Serializable(with = InlineUsersAttestationsBulkListPostResponse200JsonXd1deca67.Serializer::class)
public class InlineUsersAttestationsBulkListPostResponse200JsonXd1deca67(
  attestationsSubjectDigests: Map<String, List<InlineUsersAttestationsBul9240PostResponse200JsonItemXf9093b37>?>? = null,
  /**
   * Information about the current page.
   */
  public val pageInfo: InlineUsersAttestationsBulkListPostResponse200JsonPageInfoXadd2f15c? = null,
) {
  /**
   * Mapping of subject digest to bundles.
   */
  public val attestationsSubjectDigests:
      Map<String, List<InlineUsersAttestationsBul9240PostResponse200JsonItemXf9093b37>?>? =
      attestationsSubjectDigests?.let { collection0 -> collection0.entries.associate { (key1, mapValue1) -> key1 to mapValue1?.let { collection2 -> collection2.toList() } } }

  public class Builder {
    private var attestationsSubjectDigestsValue:
        Map<String, List<InlineUsersAttestationsBul9240PostResponse200JsonItemXf9093b37>?>? = null

    /**
     * Mapping of subject digest to bundles.
     */
    public var attestationsSubjectDigests:
        Map<String, List<InlineUsersAttestationsBul9240PostResponse200JsonItemXf9093b37>?>?
      get() = attestationsSubjectDigestsValue?.let { collection0 -> collection0.entries.associate { (key1, mapValue1) -> key1 to mapValue1?.let { collection2 -> collection2.toList() } } }
      set(`value`) {
        attestationsSubjectDigestsValue = value?.let { collection0 -> collection0.entries.associate { (key1, mapValue1) -> key1 to mapValue1?.let { collection2 -> collection2.toList() } } }
      }

    /**
     * Information about the current page.
     */
    public var pageInfo: InlineUsersAttestationsBulkListPostResponse200JsonPageInfoXadd2f15c? = null

    public fun build(): InlineUsersAttestationsBulkListPostResponse200JsonXd1deca67 = InlineUsersAttestationsBulkListPostResponse200JsonXd1deca67(
      attestationsSubjectDigests = attestationsSubjectDigests,
      pageInfo = pageInfo,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineUsersAttestationsBulkListPostResponse200JsonXd1deca67 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineUsersAttestationsBulkListPostResponse200JsonXd1deca67> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineUsersAttestationsBulkListPostResponse200JsonXd1deca67 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineUsersAttestationsBulkListPostResponse200JsonXd1deca67")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineUsersAttestationsBulkListPostResponse200JsonXd1deca67 must be a JSON object")
      return InlineUsersAttestationsBulkListPostResponse200JsonXd1deca67(
        attestationsSubjectDigests = rawObject["attestations_subject_digests"]?.let { json.decodeFromJsonElement<Map<String, List<InlineUsersAttestationsBul9240PostResponse200JsonItemXf9093b37>?>>(it) },
        pageInfo = rawObject["page_info"]?.let { json.decodeFromJsonElement<InlineUsersAttestationsBulkListPostResponse200JsonPageInfoXadd2f15c>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineUsersAttestationsBulkListPostResponse200JsonXd1deca67) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineUsersAttestationsBulkListPostResponse200JsonXd1deca67")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.attestationsSubjectDigests?.let { put("attestations_subject_digests", json.encodeToJsonElement(it)) }
        value.pageInfo?.let { put("page_info", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineUsersAttestationsBulkListPostResponse200JsonXd1deca67(block: InlineUsersAttestationsBulkListPostResponse200JsonXd1deca67.Builder.() -> Unit): InlineUsersAttestationsBulkListPostResponse200JsonXd1deca67 = InlineUsersAttestationsBulkListPostResponse200JsonXd1deca67.build(block)
