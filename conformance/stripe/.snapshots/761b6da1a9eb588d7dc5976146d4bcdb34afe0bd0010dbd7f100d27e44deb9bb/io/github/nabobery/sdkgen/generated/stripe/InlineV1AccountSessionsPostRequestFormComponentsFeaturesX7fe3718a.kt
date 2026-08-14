package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
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
 * sdkgen://source/openapi.json#/paths/~1v1~1account_sessions/post/requestBody/content/application~1x-www-form-urlencode
 * d/schema/properties/components/properties/financial_account/properties/features.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1account_sessions/post/requestBody/content/application~1x-www-form-urlencode
 * d/schema/properties/components/properties/financial_account/properties/features
 */
@Serializable(with = InlineV1AccountSessionsPostRequestFormComponentsFeaturesX7fe3718a.Serializer::class)
public class InlineV1AccountSessionsPostRequestFormComponentsFeaturesX7fe3718a(
  public val disableStripeUserAuthentication: Boolean? = null,
  public val externalAccountCollection: Boolean? = null,
  public val sendMoney: Boolean? = null,
  public val transferBalance: Boolean? = null,
) {
  public class Builder {
    public var disableStripeUserAuthentication: Boolean? = null

    public var externalAccountCollection: Boolean? = null

    public var sendMoney: Boolean? = null

    public var transferBalance: Boolean? = null

    public fun build(): InlineV1AccountSessionsPostRequestFormComponentsFeaturesX7fe3718a = InlineV1AccountSessionsPostRequestFormComponentsFeaturesX7fe3718a(
      disableStripeUserAuthentication = disableStripeUserAuthentication,
      externalAccountCollection = externalAccountCollection,
      sendMoney = sendMoney,
      transferBalance = transferBalance,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountSessionsPostRequestFormComponentsFeaturesX7fe3718a = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1AccountSessionsPostRequestFormComponentsFeaturesX7fe3718a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountSessionsPostRequestFormComponentsFeaturesX7fe3718a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountSessionsPostRequestFormComponentsFeaturesX7fe3718a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountSessionsPostRequestFormComponentsFeaturesX7fe3718a must be a JSON object")
      return InlineV1AccountSessionsPostRequestFormComponentsFeaturesX7fe3718a(
        disableStripeUserAuthentication = rawObject["disable_stripe_user_authentication"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        externalAccountCollection = rawObject["external_account_collection"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        sendMoney = rawObject["send_money"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        transferBalance = rawObject["transfer_balance"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountSessionsPostRequestFormComponentsFeaturesX7fe3718a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountSessionsPostRequestFormComponentsFeaturesX7fe3718a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.disableStripeUserAuthentication?.let { put("disable_stripe_user_authentication", json.encodeToJsonElement(it)) }
        value.externalAccountCollection?.let { put("external_account_collection", json.encodeToJsonElement(it)) }
        value.sendMoney?.let { put("send_money", json.encodeToJsonElement(it)) }
        value.transferBalance?.let { put("transfer_balance", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AccountSessionsPostRequestFormComponentsFeaturesX7fe3718a(block: InlineV1AccountSessionsPostRequestFormComponentsFeaturesX7fe3718a.Builder.() -> Unit): InlineV1AccountSessionsPostRequestFormComponentsFeaturesX7fe3718a = InlineV1AccountSessionsPostRequestFormComponentsFeaturesX7fe3718a.build(block)
