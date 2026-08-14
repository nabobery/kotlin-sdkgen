package io.github.nabobery.sdkgen.github.generated

import kotlin.Boolean
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
 * Provides details of Public IP for a GitHub-hosted larger runners
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/public-ip
 */
@Serializable(with = PublicIp.Serializer::class)
public class PublicIp(
  /**
   * Whether public IP is enabled.
   */
  public val enabled: Boolean? = null,
  /**
   * The length of the IP prefix.
   */
  public val length: Int? = null,
  /**
   * The prefix for the public IP.
   */
  public val prefix: String? = null,
) {
  public class Builder {
    /**
     * Whether public IP is enabled.
     */
    public var enabled: Boolean? = null

    /**
     * The length of the IP prefix.
     */
    public var length: Int? = null

    /**
     * The prefix for the public IP.
     */
    public var prefix: String? = null

    public fun build(): PublicIp = PublicIp(
      enabled = enabled,
      length = length,
      prefix = prefix,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PublicIp = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PublicIp> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PublicIp {
      val jsonDecoder = decoder.requireJsonDecoder("PublicIp")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PublicIp must be a JSON object")
      return PublicIp(
        enabled = rawObject["enabled"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        length = rawObject["length"]?.let { json.decodeFromJsonElement<Int>(it) },
        prefix = rawObject["prefix"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PublicIp) {
      val jsonEncoder = encoder.requireJsonEncoder("PublicIp")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.enabled?.let { put("enabled", json.encodeToJsonElement(it)) }
        value.length?.let { put("length", json.encodeToJsonElement(it)) }
        value.prefix?.let { put("prefix", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun publicIp(block: PublicIp.Builder.() -> Unit): PublicIp = PublicIp.build(block)
