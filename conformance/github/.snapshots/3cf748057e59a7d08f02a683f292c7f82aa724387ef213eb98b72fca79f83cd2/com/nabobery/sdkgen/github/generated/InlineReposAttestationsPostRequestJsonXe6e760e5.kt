package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlin.Unit
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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1attestations/post/requestBody/content/application~1json
 * /schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1attestations/post/requestBody/content/application~1json
 * /schema
 */
@Serializable(with = InlineReposAttestationsPostRequestJsonXe6e760e5.Serializer::class)
public class InlineReposAttestationsPostRequestJsonXe6e760e5(
  /**
   * The attestation's Sigstore Bundle.
   * Refer to the [Sigstore Bundle
   * Specification](https://github.com/sigstore/protobuf-specs/blob/main/protos/sigstore_bundle.proto) for more
   * information.
   */
  public val bundle: InlineReposAttestationsPostRequestJsonBundleX81e290e0,
) {
  public class Builder {
    private var bundleValue: InlineReposAttestationsPostRequestJsonBundleX81e290e0? = null

    public var bundle: InlineReposAttestationsPostRequestJsonBundleX81e290e0
      get() = requireNotNull(bundleValue) { "bundle is required" }
      set(`value`) {
        bundleValue = value
      }

    public fun build(): InlineReposAttestationsPostRequestJsonXe6e760e5 {
      check(bundleValue != null) { "bundle is required" }
      return InlineReposAttestationsPostRequestJsonXe6e760e5(
        bundle = bundle,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposAttestationsPostRequestJsonXe6e760e5 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineReposAttestationsPostRequestJsonXe6e760e5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposAttestationsPostRequestJsonXe6e760e5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposAttestationsPostRequestJsonXe6e760e5")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposAttestationsPostRequestJsonXe6e760e5 must be a JSON object")
      val bundle = json.decodeRequired<InlineReposAttestationsPostRequestJsonBundleX81e290e0>(rawObject, "bundle")
      return InlineReposAttestationsPostRequestJsonXe6e760e5(
        bundle = bundle,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposAttestationsPostRequestJsonXe6e760e5) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposAttestationsPostRequestJsonXe6e760e5")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("bundle", json.encodeToJsonElement(value.bundle))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposAttestationsPostRequestJsonXe6e760e5(block: InlineReposAttestationsPostRequestJsonXe6e760e5.Builder.() -> Unit): InlineReposAttestationsPostRequestJsonXe6e760e5 = InlineReposAttestationsPostRequestJsonXe6e760e5.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposAttestationsPostRequestJsonXe6e760e5 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
