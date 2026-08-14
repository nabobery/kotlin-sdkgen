package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineOutboundTransfersPaymentMethodDetailsUsBankAccountMandateX53a82f7aBranch {
  Branch1,
  Mandate,
}

public sealed class InlineOutboundTransfersPaymentMethodDetailsUsBankAccountMandateX53a82f7aDecodingException(
  message: String,
) : SerializationException(message)

public class InlineOutboundTransfersPaymentMethodDetailsUsBankAccountMandateX53a82f7aNoMatchException(
  message: String,
) : InlineOutboundTransfersPaymentMethodDetailsUsBankAccountMandateX53a82f7aDecodingException(message)

internal data class InlineOutboundTransfersPaymentMethodDetailsUsBankAccountMandateX53a82f7aInspection(
  public val matchesBranch1: Boolean,
  public val matchesMandate: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesMandate).count { it }
}

/**
 * ID of the mandate used to make this payment.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/outbound_transfers_payment_method_details_us_bank_account/properties
 * /mandate
 */
@Serializable(with = InlineOutboundTransfersPaymentMethodDetailsUsBankAccountMandateX53a82f7a.Serializer::class)
public class InlineOutboundTransfersPaymentMethodDetailsUsBankAccountMandateX53a82f7a internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineOutboundTransfersPaymentMethodDetailsUsBankAccountMandateX53a82f7aInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val mandate: Mandate? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesMandate) json.decodeFromJsonElement<Mandate>(raw) else null }

  public val matchedBranches:
      Set<InlineOutboundTransfersPaymentMethodDetailsUsBankAccountMandateX53a82f7aBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineOutboundTransfersPaymentMethodDetailsUsBankAccountMandateX53a82f7aBranch.Branch1)
      if (inspection.matchesMandate) add(InlineOutboundTransfersPaymentMethodDetailsUsBankAccountMandateX53a82f7aBranch.Mandate)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineOutboundTransfersPaymentMethodDetailsUsBankAccountMandateX53a82f7a {
      val inspection = inspectInlineOutboundTransfersPaymentMethodDetailsUsBankAccountMandateX53a82f7a(raw)
      if (inspection.matchCount == 0) {
        throw InlineOutboundTransfersPaymentMethodDetailsUsBankAccountMandateX53a82f7aNoMatchException("InlineOutboundTransfersPaymentMethodDetailsUsBankAccountMandateX53a82f7a matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineOutboundTransfersPaymentMethodDetailsUsBankAccountMandateX53a82f7a(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineOutboundTransfersPaymentMethodDetailsUsBankAccountMandateX53a82f7a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOutboundTransfersPaymentMethodDetailsUsBankAccountMandateX53a82f7a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOutboundTransfersPaymentMethodDetailsUsBankAccountMandateX53a82f7a")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineOutboundTransfersPaymentMethodDetailsUsBankAccountMandateX53a82f7a) {
      encoder.requireJsonEncoder("InlineOutboundTransfersPaymentMethodDetailsUsBankAccountMandateX53a82f7a").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineOutboundTransfersPaymentMethodDetailsUsBankAccountMandateX53a82f7a(element: JsonElement): InlineOutboundTransfersPaymentMethodDetailsUsBankAccountMandateX53a82f7aInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesMandate = element.isJsonDecodable<Mandate>()
  return InlineOutboundTransfersPaymentMethodDetailsUsBankAccountMandateX53a82f7aInspection(
    matchesBranch1 = matchesBranch1,
    matchesMandate = matchesMandate,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesMandate) add("Mandate: value does not match Mandate")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
