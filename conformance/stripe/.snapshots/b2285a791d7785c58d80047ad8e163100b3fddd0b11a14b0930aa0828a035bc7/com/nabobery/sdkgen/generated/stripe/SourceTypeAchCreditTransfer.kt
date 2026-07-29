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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.json#/components/schemas/source_type_ach_credit_transfer.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/source_type_ach_credit_transfer
 */
@Serializable(with = SourceTypeAchCreditTransfer.Serializer::class)
public class SourceTypeAchCreditTransfer(
  public val accountNumber: String? = null,
  public val bankName: String? = null,
  public val fingerprint: String? = null,
  public val refundAccountHolderName: String? = null,
  public val refundAccountHolderType: String? = null,
  public val refundRoutingNumber: String? = null,
  public val routingNumber: String? = null,
  public val swiftCode: String? = null,
) {
  public class Builder {
    public var accountNumber: String? = null

    public var bankName: String? = null

    public var fingerprint: String? = null

    public var refundAccountHolderName: String? = null

    public var refundAccountHolderType: String? = null

    public var refundRoutingNumber: String? = null

    public var routingNumber: String? = null

    public var swiftCode: String? = null

    public fun build(): SourceTypeAchCreditTransfer = SourceTypeAchCreditTransfer(
      accountNumber = accountNumber,
      bankName = bankName,
      fingerprint = fingerprint,
      refundAccountHolderName = refundAccountHolderName,
      refundAccountHolderType = refundAccountHolderType,
      refundRoutingNumber = refundRoutingNumber,
      routingNumber = routingNumber,
      swiftCode = swiftCode,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SourceTypeAchCreditTransfer = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<SourceTypeAchCreditTransfer> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SourceTypeAchCreditTransfer {
      val jsonDecoder = decoder.requireJsonDecoder("SourceTypeAchCreditTransfer")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SourceTypeAchCreditTransfer must be a JSON object")
      return SourceTypeAchCreditTransfer(
        accountNumber = rawObject["account_number"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        bankName = rawObject["bank_name"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        fingerprint = rawObject["fingerprint"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        refundAccountHolderName = rawObject["refund_account_holder_name"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        refundAccountHolderType = rawObject["refund_account_holder_type"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        refundRoutingNumber = rawObject["refund_routing_number"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        routingNumber = rawObject["routing_number"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        swiftCode = rawObject["swift_code"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SourceTypeAchCreditTransfer) {
      val jsonEncoder = encoder.requireJsonEncoder("SourceTypeAchCreditTransfer")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.accountNumber?.let { put("account_number", it) }
        value.bankName?.let { put("bank_name", it) }
        value.fingerprint?.let { put("fingerprint", it) }
        value.refundAccountHolderName?.let { put("refund_account_holder_name", it) }
        value.refundAccountHolderType?.let { put("refund_account_holder_type", it) }
        value.refundRoutingNumber?.let { put("refund_routing_number", it) }
        value.routingNumber?.let { put("routing_number", it) }
        value.swiftCode?.let { put("swift_code", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun sourceTypeAchCreditTransfer(block: SourceTypeAchCreditTransfer.Builder.() -> Unit): SourceTypeAchCreditTransfer = SourceTypeAchCreditTransfer.build(block)
