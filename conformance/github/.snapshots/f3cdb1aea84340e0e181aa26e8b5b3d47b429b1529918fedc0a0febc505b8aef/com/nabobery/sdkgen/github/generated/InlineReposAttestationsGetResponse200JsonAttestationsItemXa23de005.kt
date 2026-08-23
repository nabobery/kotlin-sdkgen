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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1attestations~1{subject_digest}/get/responses/200/conten
 * t/application~1json/schema/properties/attestations/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1attestations~1{subject_digest}/get/responses/200/conten
 * t/application~1json/schema/properties/attestations/items
 */
@Serializable(with = InlineReposAttestationsGetResponse200JsonAttestationsItemXa23de005.Serializer::class)
public class InlineReposAttestationsGetResponse200JsonAttestationsItemXa23de005(
  /**
   * The attestation's Sigstore Bundle.
   * Refer to the [Sigstore Bundle
   * Specification](https://github.com/sigstore/protobuf-specs/blob/main/protos/sigstore_bundle.proto) for more
   * information.
   */
  public val bundle:
      InlineReposAttestationsGetResponse200JsonAttestationsItemBundleXc6a5b4fa? = null,
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
    public var bundle: InlineReposAttestationsGetResponse200JsonAttestationsItemBundleXc6a5b4fa? =
        null

    public var bundleUrl: String? = null

    public var initiator: String? = null

    public var repositoryId: Int? = null

    public fun build(): InlineReposAttestationsGetResponse200JsonAttestationsItemXa23de005 = InlineReposAttestationsGetResponse200JsonAttestationsItemXa23de005(
      bundle = bundle,
      bundleUrl = bundleUrl,
      initiator = initiator,
      repositoryId = repositoryId,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposAttestationsGetResponse200JsonAttestationsItemXa23de005 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposAttestationsGetResponse200JsonAttestationsItemXa23de005> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposAttestationsGetResponse200JsonAttestationsItemXa23de005 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposAttestationsGetResponse200JsonAttestationsItemXa23de005")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposAttestationsGetResponse200JsonAttestationsItemXa23de005 must be a JSON object")
      return InlineReposAttestationsGetResponse200JsonAttestationsItemXa23de005(
        bundle = rawObject["bundle"]?.let { json.decodeFromJsonElement<InlineReposAttestationsGetResponse200JsonAttestationsItemBundleXc6a5b4fa>(it) },
        bundleUrl = rawObject["bundle_url"]?.let { json.decodeFromJsonElement<String>(it) },
        initiator = rawObject["initiator"]?.let { json.decodeFromJsonElement<String>(it) },
        repositoryId = rawObject["repository_id"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposAttestationsGetResponse200JsonAttestationsItemXa23de005) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposAttestationsGetResponse200JsonAttestationsItemXa23de005")
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

public fun inlineReposAttestationsGetResponse200JsonAttestationsItemXa23de005(block: InlineReposAttestationsGetResponse200JsonAttestationsItemXa23de005.Builder.() -> Unit): InlineReposAttestationsGetResponse200JsonAttestationsItemXa23de005 = InlineReposAttestationsGetResponse200JsonAttestationsItemXa23de005.build(block)
