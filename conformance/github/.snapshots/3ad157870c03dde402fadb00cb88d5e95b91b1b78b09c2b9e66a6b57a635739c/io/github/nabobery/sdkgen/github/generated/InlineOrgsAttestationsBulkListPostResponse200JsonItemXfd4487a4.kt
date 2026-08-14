package io.github.nabobery.sdkgen.github.generated

import kotlin.Int
import kotlin.String
import kotlin.Unit
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
 * on/schema/properties/attestations_subject_digests/additionalProperties/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1attestations~1bulk-list/post/responses/200/content/application~1js
 * on/schema/properties/attestations_subject_digests/additionalProperties/items
 */
@Serializable(with = InlineOrgsAttestationsBulkListPostResponse200JsonItemXfd4487a4.Serializer::class)
public class InlineOrgsAttestationsBulkListPostResponse200JsonItemXfd4487a4(
  /**
   * The bundle of the attestation.
   */
  public val bundle: InlineOrgsAttestationsBulkListPostResponse200JsonBundleXc72137d5? = null,
  public val bundleUrl: String? = null,
  public val repositoryId: Int? = null,
) {
  public class Builder {
    /**
     * The bundle of the attestation.
     */
    public var bundle: InlineOrgsAttestationsBulkListPostResponse200JsonBundleXc72137d5? = null

    public var bundleUrl: String? = null

    public var repositoryId: Int? = null

    public fun build(): InlineOrgsAttestationsBulkListPostResponse200JsonItemXfd4487a4 = InlineOrgsAttestationsBulkListPostResponse200JsonItemXfd4487a4(
      bundle = bundle,
      bundleUrl = bundleUrl,
      repositoryId = repositoryId,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsAttestationsBulkListPostResponse200JsonItemXfd4487a4 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsAttestationsBulkListPostResponse200JsonItemXfd4487a4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsAttestationsBulkListPostResponse200JsonItemXfd4487a4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsAttestationsBulkListPostResponse200JsonItemXfd4487a4")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsAttestationsBulkListPostResponse200JsonItemXfd4487a4 must be a JSON object")
      return InlineOrgsAttestationsBulkListPostResponse200JsonItemXfd4487a4(
        bundle = rawObject["bundle"]?.let { json.decodeFromJsonElement<InlineOrgsAttestationsBulkListPostResponse200JsonBundleXc72137d5>(it) },
        bundleUrl = rawObject["bundle_url"]?.let { json.decodeFromJsonElement<String>(it) },
        repositoryId = rawObject["repository_id"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsAttestationsBulkListPostResponse200JsonItemXfd4487a4) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsAttestationsBulkListPostResponse200JsonItemXfd4487a4")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.bundle?.let { put("bundle", json.encodeToJsonElement(it)) }
        value.bundleUrl?.let { put("bundle_url", it) }
        value.repositoryId?.let { put("repository_id", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsAttestationsBulkListPostResponse200JsonItemXfd4487a4(block: InlineOrgsAttestationsBulkListPostResponse200JsonItemXfd4487a4.Builder.() -> Unit): InlineOrgsAttestationsBulkListPostResponse200JsonItemXfd4487a4 = InlineOrgsAttestationsBulkListPostResponse200JsonItemXfd4487a4.build(block)
