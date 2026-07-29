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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/settings/properties/payouts.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/settings/properties/payouts
 */
@Serializable(with = InlineV1AccountsPostRequestFormSettingsPayoutsX491a77ee.Serializer::class)
public class InlineV1AccountsPostRequestFormSettingsPayoutsX491a77ee(
  public val debitNegativeBalances: Boolean? = null,
  public val schedule: InlineV1AccountsPostRequestFormSettingsPayoutsScheduleX28db0ac7? = null,
  public val statementDescriptor: String? = null,
) {
  public class Builder {
    public var debitNegativeBalances: Boolean? = null

    public var schedule: InlineV1AccountsPostRequestFormSettingsPayoutsScheduleX28db0ac7? = null

    public var statementDescriptor: String? = null

    public fun build(): InlineV1AccountsPostRequestFormSettingsPayoutsX491a77ee = InlineV1AccountsPostRequestFormSettingsPayoutsX491a77ee(
      debitNegativeBalances = debitNegativeBalances,
      schedule = schedule,
      statementDescriptor = statementDescriptor,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountsPostRequestFormSettingsPayoutsX491a77ee = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1AccountsPostRequestFormSettingsPayoutsX491a77ee> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormSettingsPayoutsX491a77ee {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPostRequestFormSettingsPayoutsX491a77ee")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsPostRequestFormSettingsPayoutsX491a77ee must be a JSON object")
      return InlineV1AccountsPostRequestFormSettingsPayoutsX491a77ee(
        debitNegativeBalances = rawObject["debit_negative_balances"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        schedule = rawObject["schedule"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormSettingsPayoutsScheduleX28db0ac7>(it) },
        statementDescriptor = rawObject["statement_descriptor"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPostRequestFormSettingsPayoutsX491a77ee) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPostRequestFormSettingsPayoutsX491a77ee")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.debitNegativeBalances?.let { put("debit_negative_balances", json.encodeToJsonElement(it)) }
        value.schedule?.let { put("schedule", json.encodeToJsonElement(it)) }
        value.statementDescriptor?.let { put("statement_descriptor", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AccountsPostRequestFormSettingsPayoutsX491a77ee(block: InlineV1AccountsPostRequestFormSettingsPayoutsX491a77ee.Builder.() -> Unit): InlineV1AccountsPostRequestFormSettingsPayoutsX491a77ee = InlineV1AccountsPostRequestFormSettingsPayoutsX491a77ee.build(block)
