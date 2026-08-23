package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
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
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/connect_embedded_account_features_claim
 */
@Serializable(with = ConnectEmbeddedAccountFeaturesClaim.Serializer::class)
public class ConnectEmbeddedAccountFeaturesClaim(
  /**
   * Whether Stripe user authentication is disabled. This value can only be `true` for accounts where
   * `controller.requirement_collection` is `application` for the account. The default value is the opposite of the
   * `external_account_collection` value. For example, if you don't set `external_account_collection`, it defaults to
   * `true` and `disable_stripe_user_authentication` defaults to `false`.
   */
  public val disableStripeUserAuthentication: Boolean,
  /**
   * Whether external account collection is enabled. This feature can only be `false` for accounts where you’re
   * responsible for collecting updated information when requirements are due or change, like Custom accounts. The
   * default value for this feature is `true`.
   */
  public val externalAccountCollection: Boolean,
) {
  public class Builder {
    private var disableStripeUserAuthenticationValue: Boolean? = null

    public var disableStripeUserAuthentication: Boolean
      get() = requireNotNull(disableStripeUserAuthenticationValue) { "disableStripeUserAuthentication is required" }
      set(`value`) {
        disableStripeUserAuthenticationValue = value
      }

    private var externalAccountCollectionValue: Boolean? = null

    public var externalAccountCollection: Boolean
      get() = requireNotNull(externalAccountCollectionValue) { "externalAccountCollection is required" }
      set(`value`) {
        externalAccountCollectionValue = value
      }

    public fun build(): ConnectEmbeddedAccountFeaturesClaim {
      check(disableStripeUserAuthenticationValue != null) { "disableStripeUserAuthentication is required" }
      check(externalAccountCollectionValue != null) { "externalAccountCollection is required" }
      return ConnectEmbeddedAccountFeaturesClaim(
        disableStripeUserAuthentication = disableStripeUserAuthentication,
        externalAccountCollection = externalAccountCollection,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ConnectEmbeddedAccountFeaturesClaim = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ConnectEmbeddedAccountFeaturesClaim> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ConnectEmbeddedAccountFeaturesClaim {
      val jsonDecoder = decoder.requireJsonDecoder("ConnectEmbeddedAccountFeaturesClaim")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ConnectEmbeddedAccountFeaturesClaim must be a JSON object")
      val disableStripeUserAuthentication = json.decodeRequired<Boolean>(rawObject, "disable_stripe_user_authentication")
      val externalAccountCollection = json.decodeRequired<Boolean>(rawObject, "external_account_collection")
      return ConnectEmbeddedAccountFeaturesClaim(
        disableStripeUserAuthentication = disableStripeUserAuthentication,
        externalAccountCollection = externalAccountCollection,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ConnectEmbeddedAccountFeaturesClaim) {
      val jsonEncoder = encoder.requireJsonEncoder("ConnectEmbeddedAccountFeaturesClaim")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("disable_stripe_user_authentication", json.encodeToJsonElement(value.disableStripeUserAuthentication))
        put("external_account_collection", json.encodeToJsonElement(value.externalAccountCollection))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun connectEmbeddedAccountFeaturesClaim(block: ConnectEmbeddedAccountFeaturesClaim.Builder.() -> Unit): ConnectEmbeddedAccountFeaturesClaim = ConnectEmbeddedAccountFeaturesClaim.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ConnectEmbeddedAccountFeaturesClaim is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
