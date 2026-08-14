package io.github.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/settings/properties/payouts.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/settings/properties/payouts
 */
@Serializable(with = InlineV1AccountsPostRequestFormSettingsPayoutsXd77873f8.Serializer::class)
public class InlineV1AccountsPostRequestFormSettingsPayoutsXd77873f8(
  public val debitNegativeBalances: Boolean? = null,
  public val schedule: InlineV1AccountsPostRequestFormSettingsPayoutsScheduleXea38b562? = null,
  public val statementDescriptor: String? = null,
) {
  public class Builder {
    public var debitNegativeBalances: Boolean? = null

    public var schedule: InlineV1AccountsPostRequestFormSettingsPayoutsScheduleXea38b562? = null

    public var statementDescriptor: String? = null

    public fun build(): InlineV1AccountsPostRequestFormSettingsPayoutsXd77873f8 = InlineV1AccountsPostRequestFormSettingsPayoutsXd77873f8(
      debitNegativeBalances = debitNegativeBalances,
      schedule = schedule,
      statementDescriptor = statementDescriptor,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountsPostRequestFormSettingsPayoutsXd77873f8 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1AccountsPostRequestFormSettingsPayoutsXd77873f8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormSettingsPayoutsXd77873f8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPostRequestFormSettingsPayoutsXd77873f8")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsPostRequestFormSettingsPayoutsXd77873f8 must be a JSON object")
      return InlineV1AccountsPostRequestFormSettingsPayoutsXd77873f8(
        debitNegativeBalances = rawObject["debit_negative_balances"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        schedule = rawObject["schedule"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormSettingsPayoutsScheduleXea38b562>(it) },
        statementDescriptor = rawObject["statement_descriptor"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPostRequestFormSettingsPayoutsXd77873f8) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPostRequestFormSettingsPayoutsXd77873f8")
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

public fun inlineV1AccountsPostRequestFormSettingsPayoutsXd77873f8(block: InlineV1AccountsPostRequestFormSettingsPayoutsXd77873f8.Builder.() -> Unit): InlineV1AccountsPostRequestFormSettingsPayoutsXd77873f8 = InlineV1AccountsPostRequestFormSettingsPayoutsXd77873f8.build(block)
