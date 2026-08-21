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
import kotlinx.serialization.json.put

/**
 * Social media account
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/social-account
 */
@Serializable(with = SocialAccount.Serializer::class)
public class SocialAccount(
  public val provider: String,
  public val url: String,
) {
  public class Builder {
    private var providerValue: String? = null

    public var provider: String
      get() = requireNotNull(providerValue) { "provider is required" }
      set(`value`) {
        providerValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    public fun build(): SocialAccount {
      check(providerValue != null) { "provider is required" }
      check(urlValue != null) { "url is required" }
      return SocialAccount(
        provider = provider,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SocialAccount = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<SocialAccount> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SocialAccount {
      val jsonDecoder = decoder.requireJsonDecoder("SocialAccount")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SocialAccount must be a JSON object")
      val provider = json.decodeRequired<String>(rawObject, "provider")
      val url = json.decodeRequired<String>(rawObject, "url")
      return SocialAccount(
        provider = provider,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: SocialAccount) {
      val jsonEncoder = encoder.requireJsonEncoder("SocialAccount")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("provider", value.provider)
        put("url", value.url)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun socialAccount(block: SocialAccount.Builder.() -> Unit): SocialAccount = SocialAccount.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("SocialAccount is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
