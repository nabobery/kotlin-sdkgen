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
 * sdkgen://source/openapi.yaml#/paths/~1user~1social_accounts/post/requestBody/content/application~1json/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1user~1social_accounts/post/requestBody/content/application~1json/schema
 */
@Serializable(with = InlineUserSocialAccountsPostRequestJsonX141ac9f4.Serializer::class)
public class InlineUserSocialAccountsPostRequestJsonX141ac9f4(
  accountUrls: List<String>,
) {
  /**
   * Full URLs for the social media profiles to add.
   */
  public val accountUrls: List<String> = accountUrls.toList()

  public class Builder {
    private var accountUrlsValue: List<String>? = null

    public var accountUrls: List<String>
      get() = requireNotNull(accountUrlsValue) { "accountUrls is required" }.toList()
      set(`value`) {
        accountUrlsValue = value.toList()
      }

    public fun build(): InlineUserSocialAccountsPostRequestJsonX141ac9f4 {
      check(accountUrlsValue != null) { "accountUrls is required" }
      return InlineUserSocialAccountsPostRequestJsonX141ac9f4(
        accountUrls = accountUrls,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineUserSocialAccountsPostRequestJsonX141ac9f4 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineUserSocialAccountsPostRequestJsonX141ac9f4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineUserSocialAccountsPostRequestJsonX141ac9f4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineUserSocialAccountsPostRequestJsonX141ac9f4")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineUserSocialAccountsPostRequestJsonX141ac9f4 must be a JSON object")
      val accountUrls = json.decodeRequired<List<String>>(rawObject, "account_urls")
      return InlineUserSocialAccountsPostRequestJsonX141ac9f4(
        accountUrls = accountUrls,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineUserSocialAccountsPostRequestJsonX141ac9f4) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineUserSocialAccountsPostRequestJsonX141ac9f4")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("account_urls", json.encodeToJsonElement(value.accountUrls))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineUserSocialAccountsPostRequestJsonX141ac9f4(block: InlineUserSocialAccountsPostRequestJsonX141ac9f4.Builder.() -> Unit): InlineUserSocialAccountsPostRequestJsonX141ac9f4 = InlineUserSocialAccountsPostRequestJsonX141ac9f4.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineUserSocialAccountsPostRequestJsonX141ac9f4 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
