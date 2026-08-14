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
 * sdkgen://source/openapi.yaml#/paths/~1users~1{username}~1attestations~1{subject_digest}/get/responses/200/content/app
 * lication~1json/schema/properties/attestations/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1users~1{username}~1attestations~1{subject_digest}/get/responses/200/content/app
 * lication~1json/schema/properties/attestations/items
 */
@Serializable(with = InlineUsersAttestationsGetResponse200JsonAttestationsItemXa235c29e.Serializer::class)
public class InlineUsersAttestationsGetResponse200JsonAttestationsItemXa235c29e(
  /**
   * The attestation's Sigstore Bundle.
   * Refer to the [Sigstore Bundle
   * Specification](https://github.com/sigstore/protobuf-specs/blob/main/protos/sigstore_bundle.proto) for more
   * information.
   */
  public val bundle:
      InlineUsersAttestationsGetResponse200JsonAttestationsItemBundleXcfc30299? = null,
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
    public var bundle: InlineUsersAttestationsGetResponse200JsonAttestationsItemBundleXcfc30299? =
        null

    public var bundleUrl: String? = null

    public var initiator: String? = null

    public var repositoryId: Int? = null

    public fun build(): InlineUsersAttestationsGetResponse200JsonAttestationsItemXa235c29e = InlineUsersAttestationsGetResponse200JsonAttestationsItemXa235c29e(
      bundle = bundle,
      bundleUrl = bundleUrl,
      initiator = initiator,
      repositoryId = repositoryId,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineUsersAttestationsGetResponse200JsonAttestationsItemXa235c29e = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineUsersAttestationsGetResponse200JsonAttestationsItemXa235c29e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineUsersAttestationsGetResponse200JsonAttestationsItemXa235c29e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineUsersAttestationsGetResponse200JsonAttestationsItemXa235c29e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineUsersAttestationsGetResponse200JsonAttestationsItemXa235c29e must be a JSON object")
      return InlineUsersAttestationsGetResponse200JsonAttestationsItemXa235c29e(
        bundle = rawObject["bundle"]?.let { json.decodeFromJsonElement<InlineUsersAttestationsGetResponse200JsonAttestationsItemBundleXcfc30299>(it) },
        bundleUrl = rawObject["bundle_url"]?.let { json.decodeFromJsonElement<String>(it) },
        initiator = rawObject["initiator"]?.let { json.decodeFromJsonElement<String>(it) },
        repositoryId = rawObject["repository_id"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineUsersAttestationsGetResponse200JsonAttestationsItemXa235c29e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineUsersAttestationsGetResponse200JsonAttestationsItemXa235c29e")
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

public fun inlineUsersAttestationsGetResponse200JsonAttestationsItemXa235c29e(block: InlineUsersAttestationsGetResponse200JsonAttestationsItemXa235c29e.Builder.() -> Unit): InlineUsersAttestationsGetResponse200JsonAttestationsItemXa235c29e = InlineUsersAttestationsGetResponse200JsonAttestationsItemXa235c29e.build(block)
