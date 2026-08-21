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
 * Source: sdkgen://source/openapi.json#/components/schemas/connect_embedded_payouts_features
 */
@Serializable(with = ConnectEmbeddedPayoutsFeatures.Serializer::class)
public class ConnectEmbeddedPayoutsFeatures(
  /**
   * Whether Stripe user authentication is disabled. This value can only be `true` for accounts where
   * `controller.requirement_collection` is `application` for the account. The default value is the opposite of the
   * `external_account_collection` value. For example, if you don't set `external_account_collection`, it defaults to
   * `true` and `disable_stripe_user_authentication` defaults to `false`.
   */
  public val disableStripeUserAuthentication: Boolean,
  /**
   * Whether to allow payout schedule to be changed. Defaults to `true` when `controller.losses.payments` is set to
   * `stripe` for the account, otherwise `false`.
   */
  public val editPayoutSchedule: Boolean,
  /**
   * Whether external account collection is enabled. This feature can only be `false` for accounts where you’re
   * responsible for collecting updated information when requirements are due or change, like Custom accounts. The
   * default value for this feature is `true`.
   */
  public val externalAccountCollection: Boolean,
  /**
   * Whether to allow creation of instant payouts. The default value is `enabled` when Stripe is responsible for
   * negative account balances, and `use_dashboard_rules` otherwise.
   */
  public val instantPayouts: Boolean,
  /**
   * Whether to allow creation of standard payouts. Defaults to `true` when `controller.losses.payments` is set to
   * `stripe` for the account, otherwise `false`.
   */
  public val standardPayouts: Boolean,
) {
  public class Builder {
    private var disableStripeUserAuthenticationValue: Boolean? = null

    public var disableStripeUserAuthentication: Boolean
      get() = requireNotNull(disableStripeUserAuthenticationValue) { "disableStripeUserAuthentication is required" }
      set(`value`) {
        disableStripeUserAuthenticationValue = value
      }

    private var editPayoutScheduleValue: Boolean? = null

    public var editPayoutSchedule: Boolean
      get() = requireNotNull(editPayoutScheduleValue) { "editPayoutSchedule is required" }
      set(`value`) {
        editPayoutScheduleValue = value
      }

    private var externalAccountCollectionValue: Boolean? = null

    public var externalAccountCollection: Boolean
      get() = requireNotNull(externalAccountCollectionValue) { "externalAccountCollection is required" }
      set(`value`) {
        externalAccountCollectionValue = value
      }

    private var instantPayoutsValue: Boolean? = null

    public var instantPayouts: Boolean
      get() = requireNotNull(instantPayoutsValue) { "instantPayouts is required" }
      set(`value`) {
        instantPayoutsValue = value
      }

    private var standardPayoutsValue: Boolean? = null

    public var standardPayouts: Boolean
      get() = requireNotNull(standardPayoutsValue) { "standardPayouts is required" }
      set(`value`) {
        standardPayoutsValue = value
      }

    public fun build(): ConnectEmbeddedPayoutsFeatures {
      check(disableStripeUserAuthenticationValue != null) { "disableStripeUserAuthentication is required" }
      check(editPayoutScheduleValue != null) { "editPayoutSchedule is required" }
      check(externalAccountCollectionValue != null) { "externalAccountCollection is required" }
      check(instantPayoutsValue != null) { "instantPayouts is required" }
      check(standardPayoutsValue != null) { "standardPayouts is required" }
      return ConnectEmbeddedPayoutsFeatures(
        disableStripeUserAuthentication = disableStripeUserAuthentication,
        editPayoutSchedule = editPayoutSchedule,
        externalAccountCollection = externalAccountCollection,
        instantPayouts = instantPayouts,
        standardPayouts = standardPayouts,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ConnectEmbeddedPayoutsFeatures = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ConnectEmbeddedPayoutsFeatures> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ConnectEmbeddedPayoutsFeatures {
      val jsonDecoder = decoder.requireJsonDecoder("ConnectEmbeddedPayoutsFeatures")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ConnectEmbeddedPayoutsFeatures must be a JSON object")
      val disableStripeUserAuthentication = json.decodeRequired<Boolean>(rawObject, "disable_stripe_user_authentication")
      val editPayoutSchedule = json.decodeRequired<Boolean>(rawObject, "edit_payout_schedule")
      val externalAccountCollection = json.decodeRequired<Boolean>(rawObject, "external_account_collection")
      val instantPayouts = json.decodeRequired<Boolean>(rawObject, "instant_payouts")
      val standardPayouts = json.decodeRequired<Boolean>(rawObject, "standard_payouts")
      return ConnectEmbeddedPayoutsFeatures(
        disableStripeUserAuthentication = disableStripeUserAuthentication,
        editPayoutSchedule = editPayoutSchedule,
        externalAccountCollection = externalAccountCollection,
        instantPayouts = instantPayouts,
        standardPayouts = standardPayouts,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ConnectEmbeddedPayoutsFeatures) {
      val jsonEncoder = encoder.requireJsonEncoder("ConnectEmbeddedPayoutsFeatures")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("disable_stripe_user_authentication", json.encodeToJsonElement(value.disableStripeUserAuthentication))
        put("edit_payout_schedule", json.encodeToJsonElement(value.editPayoutSchedule))
        put("external_account_collection", json.encodeToJsonElement(value.externalAccountCollection))
        put("instant_payouts", json.encodeToJsonElement(value.instantPayouts))
        put("standard_payouts", json.encodeToJsonElement(value.standardPayouts))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun connectEmbeddedPayoutsFeatures(block: ConnectEmbeddedPayoutsFeatures.Builder.() -> Unit): ConnectEmbeddedPayoutsFeatures = ConnectEmbeddedPayoutsFeatures.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ConnectEmbeddedPayoutsFeatures is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
