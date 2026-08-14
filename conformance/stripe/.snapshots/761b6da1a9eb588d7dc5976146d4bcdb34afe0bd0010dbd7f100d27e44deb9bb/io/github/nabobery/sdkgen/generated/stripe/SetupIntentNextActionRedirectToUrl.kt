package io.github.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/setup_intent_next_action_redirect_to_url
 */
@Serializable(with = SetupIntentNextActionRedirectToUrl.Serializer::class)
public class SetupIntentNextActionRedirectToUrl(
  /**
   * If the customer does not exit their browser while authenticating, they will be redirected to this specified URL
   * after completion.
   */
  public val returnUrl: String? = null,
  /**
   * The URL you must redirect your customer to in order to authenticate.
   */
  public val url: String? = null,
) {
  public class Builder {
    /**
     * If the customer does not exit their browser while authenticating, they will be redirected to this specified URL
     * after completion.
     */
    public var returnUrl: String? = null

    /**
     * The URL you must redirect your customer to in order to authenticate.
     */
    public var url: String? = null

    public fun build(): SetupIntentNextActionRedirectToUrl = SetupIntentNextActionRedirectToUrl(
      returnUrl = returnUrl,
      url = url,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SetupIntentNextActionRedirectToUrl = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<SetupIntentNextActionRedirectToUrl> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SetupIntentNextActionRedirectToUrl {
      val jsonDecoder = decoder.requireJsonDecoder("SetupIntentNextActionRedirectToUrl")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SetupIntentNextActionRedirectToUrl must be a JSON object")
      return SetupIntentNextActionRedirectToUrl(
        returnUrl = rawObject["return_url"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        url = rawObject["url"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SetupIntentNextActionRedirectToUrl) {
      val jsonEncoder = encoder.requireJsonEncoder("SetupIntentNextActionRedirectToUrl")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.returnUrl?.let { put("return_url", it) }
        value.url?.let { put("url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun setupIntentNextActionRedirectToUrl(block: SetupIntentNextActionRedirectToUrl.Builder.() -> Unit): SetupIntentNextActionRedirectToUrl = SetupIntentNextActionRedirectToUrl.build(block)
