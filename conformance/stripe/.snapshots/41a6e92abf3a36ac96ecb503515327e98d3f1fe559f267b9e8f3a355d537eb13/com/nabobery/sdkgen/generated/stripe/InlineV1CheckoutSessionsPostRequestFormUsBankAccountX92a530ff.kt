package com.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/us_bank_account.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/us_bank_account
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormUsBankAccountX92a530ff.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormUsBankAccountX92a530ff(
  public val financialConnections:
      InlineV1CheckoutSessionsPostRequestFormFinancialConnectionsXb2172799? = null,
  public val setupFutureUsage:
      InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageXa6c46f2e? = null,
  public val targetDate: String? = null,
  public val verificationMethod:
      InlineV1CheckoutSessionsPostRequestFormVerificationMethodXd448b33c? = null,
) {
  public class Builder {
    public var financialConnections:
        InlineV1CheckoutSessionsPostRequestFormFinancialConnectionsXb2172799? = null

    public var setupFutureUsage: InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageXa6c46f2e? =
        null

    public var targetDate: String? = null

    public var verificationMethod:
        InlineV1CheckoutSessionsPostRequestFormVerificationMethodXd448b33c? = null

    public fun build(): InlineV1CheckoutSessionsPostRequestFormUsBankAccountX92a530ff = InlineV1CheckoutSessionsPostRequestFormUsBankAccountX92a530ff(
      financialConnections = financialConnections,
      setupFutureUsage = setupFutureUsage,
      targetDate = targetDate,
      verificationMethod = verificationMethod,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormUsBankAccountX92a530ff = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormUsBankAccountX92a530ff> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormUsBankAccountX92a530ff {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormUsBankAccountX92a530ff")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormUsBankAccountX92a530ff must be a JSON object")
      return InlineV1CheckoutSessionsPostRequestFormUsBankAccountX92a530ff(
        financialConnections = rawObject["financial_connections"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormFinancialConnectionsXb2172799>(it) },
        setupFutureUsage = rawObject["setup_future_usage"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageXa6c46f2e>(it) },
        targetDate = rawObject["target_date"]?.let { json.decodeFromJsonElement<String>(it) },
        verificationMethod = rawObject["verification_method"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormVerificationMethodXd448b33c>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormUsBankAccountX92a530ff) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormUsBankAccountX92a530ff")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.financialConnections?.let { put("financial_connections", json.encodeToJsonElement(it)) }
        value.setupFutureUsage?.let { put("setup_future_usage", json.encodeToJsonElement(it)) }
        value.targetDate?.let { put("target_date", it) }
        value.verificationMethod?.let { put("verification_method", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CheckoutSessionsPostRequestFormUsBankAccountX92a530ff(block: InlineV1CheckoutSessionsPostRequestFormUsBankAccountX92a530ff.Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormUsBankAccountX92a530ff = InlineV1CheckoutSessionsPostRequestFormUsBankAccountX92a530ff.build(block)
