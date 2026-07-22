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
 * sdkgen://source/openapi.yaml#/paths/~1user~1social_accounts/delete/requestBody/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1user~1social_accounts/delete/requestBody/content/application~1json/schema
 */
@Serializable(with = InlineUserSocialAccountsDeleteRequestJsonX4ce9b605.Serializer::class)
public class InlineUserSocialAccountsDeleteRequestJsonX4ce9b605(
  accountUrls: List<String>,
) {
  /**
   * Full URLs for the social media profiles to delete.
   */
  public val accountUrls: List<String> = accountUrls.toList()

  public class Builder {
    private var accountUrlsValue: List<String>? = null

    public var accountUrls: List<String>
      get() = requireNotNull(accountUrlsValue) { "accountUrls is required" }
      set(`value`) {
        accountUrlsValue = value
      }

    public fun build(): InlineUserSocialAccountsDeleteRequestJsonX4ce9b605 {
      check(accountUrlsValue != null) { "accountUrls is required" }
      return InlineUserSocialAccountsDeleteRequestJsonX4ce9b605(
        accountUrls = accountUrls,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineUserSocialAccountsDeleteRequestJsonX4ce9b605 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineUserSocialAccountsDeleteRequestJsonX4ce9b605> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineUserSocialAccountsDeleteRequestJsonX4ce9b605 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineUserSocialAccountsDeleteRequestJsonX4ce9b605")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineUserSocialAccountsDeleteRequestJsonX4ce9b605 must be a JSON object")
      val accountUrls = json.decodeRequired<List<String>>(rawObject, "account_urls")
      return InlineUserSocialAccountsDeleteRequestJsonX4ce9b605(
        accountUrls = accountUrls,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineUserSocialAccountsDeleteRequestJsonX4ce9b605) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineUserSocialAccountsDeleteRequestJsonX4ce9b605")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("account_urls", json.encodeToJsonElement(value.accountUrls))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineUserSocialAccountsDeleteRequestJsonX4ce9b605(block: InlineUserSocialAccountsDeleteRequestJsonX4ce9b605.Builder.() -> Unit): InlineUserSocialAccountsDeleteRequestJsonX4ce9b605 = InlineUserSocialAccountsDeleteRequestJsonX4ce9b605.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineUserSocialAccountsDeleteRequestJsonX4ce9b605 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
