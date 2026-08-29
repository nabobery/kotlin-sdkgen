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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1attestations~1{subject_digest}/get/responses/200/content/applicati
 * on~1json/schema/properties/attestations/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1attestations~1{subject_digest}/get/responses/200/content/applicati
 * on~1json/schema/properties/attestations/items
 */
@Serializable(with = InlineOrgsAttestationsGetResponse200JsonAttestationsItemX7475a7a1.Serializer::class)
public class InlineOrgsAttestationsGetResponse200JsonAttestationsItemX7475a7a1(
  /**
   * The attestation's Sigstore Bundle.
   * Refer to the [Sigstore Bundle
   * Specification](https://github.com/sigstore/protobuf-specs/blob/main/protos/sigstore_bundle.proto) for more
   * information.
   */
  public val bundle:
      InlineOrgsAttestationsGetResponse200JsonAttestationsItemBundleX2af5d625? = null,
  public val bundleUrl: String? = null,
  public val initiator: String? = null,
  public val repositoryId: Int? = null,
) {
  public class Builder {
    /**
     * The attestation's Sigstore Bundle.
     * Refer to the [Sigstore Bundle
     * Specification](https://github.com/sigstore/protobuf-specs/blob/main/protos/sigstore_bundle.proto) for more
     * information.
     */
    public var bundle: InlineOrgsAttestationsGetResponse200JsonAttestationsItemBundleX2af5d625? =
        null

    public var bundleUrl: String? = null

    public var initiator: String? = null

    public var repositoryId: Int? = null

    public fun build(): InlineOrgsAttestationsGetResponse200JsonAttestationsItemX7475a7a1 = InlineOrgsAttestationsGetResponse200JsonAttestationsItemX7475a7a1(
      bundle = bundle,
      bundleUrl = bundleUrl,
      initiator = initiator,
      repositoryId = repositoryId,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsAttestationsGetResponse200JsonAttestationsItemX7475a7a1 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsAttestationsGetResponse200JsonAttestationsItemX7475a7a1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsAttestationsGetResponse200JsonAttestationsItemX7475a7a1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsAttestationsGetResponse200JsonAttestationsItemX7475a7a1")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsAttestationsGetResponse200JsonAttestationsItemX7475a7a1 must be a JSON object")
      return InlineOrgsAttestationsGetResponse200JsonAttestationsItemX7475a7a1(
        bundle = rawObject["bundle"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineOrgsAttestationsGetResponse200JsonAttestationsItemBundleX2af5d625?>(element) },
        bundleUrl = rawObject["bundle_url"]?.let { json.decodeFromJsonElement<String>(it) },
        initiator = rawObject["initiator"]?.let { json.decodeFromJsonElement<String>(it) },
        repositoryId = rawObject["repository_id"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsAttestationsGetResponse200JsonAttestationsItemX7475a7a1) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsAttestationsGetResponse200JsonAttestationsItemX7475a7a1")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.bundle?.let { put("bundle", json.encodeToJsonElement(it)) }
        value.bundleUrl?.let { put("bundle_url", it) }
        value.initiator?.let { put("initiator", it) }
        value.repositoryId?.let { put("repository_id", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsAttestationsGetResponse200JsonAttestationsItemX7475a7a1(block: InlineOrgsAttestationsGetResponse200JsonAttestationsItemX7475a7a1.Builder.() -> Unit): InlineOrgsAttestationsGetResponse200JsonAttestationsItemX7475a7a1 = InlineOrgsAttestationsGetResponse200JsonAttestationsItemX7475a7a1.build(block)
