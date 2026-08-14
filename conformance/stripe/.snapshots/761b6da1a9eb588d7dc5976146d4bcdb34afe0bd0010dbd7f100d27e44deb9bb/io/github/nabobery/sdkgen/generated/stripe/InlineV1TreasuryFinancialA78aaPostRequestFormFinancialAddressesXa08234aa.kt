package io.github.nabobery.sdkgen.generated.stripe

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
 * Contains Features that add FinancialAddresses to the FinancialAccount.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1financial_accounts~1{financial_account}~1features/post/requestBod
 * y/content/application~1x-www-form-urlencoded/schema/properties/financial_addresses
 */
@Serializable(with = InlineV1TreasuryFinancialA78aaPostRequestFormFinancialAddressesXa08234aa.Serializer::class)
public class InlineV1TreasuryFinancialA78aaPostRequestFormFinancialAddressesXa08234aa(
  public val aba:
      InlineV1TreasuryFinancialA78aaPostRequestFormFinancialAddressesAbaX13d290d5? = null,
) {
  public class Builder {
    public var aba: InlineV1TreasuryFinancialA78aaPostRequestFormFinancialAddressesAbaX13d290d5? =
        null

    public fun build(): InlineV1TreasuryFinancialA78aaPostRequestFormFinancialAddressesXa08234aa = InlineV1TreasuryFinancialA78aaPostRequestFormFinancialAddressesXa08234aa(
      aba = aba,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TreasuryFinancialA78aaPostRequestFormFinancialAddressesXa08234aa = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TreasuryFinancialA78aaPostRequestFormFinancialAddressesXa08234aa> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TreasuryFinancialA78aaPostRequestFormFinancialAddressesXa08234aa {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TreasuryFinancialA78aaPostRequestFormFinancialAddressesXa08234aa")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TreasuryFinancialA78aaPostRequestFormFinancialAddressesXa08234aa must be a JSON object")
      return InlineV1TreasuryFinancialA78aaPostRequestFormFinancialAddressesXa08234aa(
        aba = rawObject["aba"]?.let { json.decodeFromJsonElement<InlineV1TreasuryFinancialA78aaPostRequestFormFinancialAddressesAbaX13d290d5>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TreasuryFinancialA78aaPostRequestFormFinancialAddressesXa08234aa) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TreasuryFinancialA78aaPostRequestFormFinancialAddressesXa08234aa")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.aba?.let { put("aba", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TreasuryFinancialA78aaPostRequestFormFinancialAddressesXa08234aa(block: InlineV1TreasuryFinancialA78aaPostRequestFormFinancialAddressesXa08234aa.Builder.() -> Unit): InlineV1TreasuryFinancialA78aaPostRequestFormFinancialAddressesXa08234aa = InlineV1TreasuryFinancialA78aaPostRequestFormFinancialAddressesXa08234aa.build(block)
