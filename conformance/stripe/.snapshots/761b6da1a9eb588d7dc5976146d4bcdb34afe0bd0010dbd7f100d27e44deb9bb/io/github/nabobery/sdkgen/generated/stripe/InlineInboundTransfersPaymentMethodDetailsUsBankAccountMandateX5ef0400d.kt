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

public enum class InlineInboundTransfersPaymentMethodDetailsUsBankAccountMandateX5ef0400dBranch {
  Branch1,
  Mandate,
}

public sealed class InlineInboundTransfersPaymentMethodDetailsUsBankAccountMandateX5ef0400dDecodingException(
  message: String,
) : SerializationException(message)

public class InlineInboundTransfersPaymentMethodDetailsUsBankAccountMandateX5ef0400dNoMatchException(
  message: String,
) : InlineInboundTransfersPaymentMethodDetailsUsBankAccountMandateX5ef0400dDecodingException(message)

internal data class InlineInboundTransfersPaymentMethodDetailsUsBankAccountMandateX5ef0400dInspection(
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
 * sdkgen://source/openapi.json#/components/schemas/inbound_transfers_payment_method_details_us_bank_account/properties/
 * mandate
 */
@Serializable(with = InlineInboundTransfersPaymentMethodDetailsUsBankAccountMandateX5ef0400d.Serializer::class)
public class InlineInboundTransfersPaymentMethodDetailsUsBankAccountMandateX5ef0400d internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineInboundTransfersPaymentMethodDetailsUsBankAccountMandateX5ef0400dInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val mandate: Mandate? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesMandate) json.decodeFromJsonElement<Mandate>(raw) else null }

  public val matchedBranches:
      Set<InlineInboundTransfersPaymentMethodDetailsUsBankAccountMandateX5ef0400dBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineInboundTransfersPaymentMethodDetailsUsBankAccountMandateX5ef0400dBranch.Branch1)
      if (inspection.matchesMandate) add(InlineInboundTransfersPaymentMethodDetailsUsBankAccountMandateX5ef0400dBranch.Mandate)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineInboundTransfersPaymentMethodDetailsUsBankAccountMandateX5ef0400d {
      val inspection = inspectInlineInboundTransfersPaymentMethodDetailsUsBankAccountMandateX5ef0400d(raw)
      if (inspection.matchCount == 0) {
        throw InlineInboundTransfersPaymentMethodDetailsUsBankAccountMandateX5ef0400dNoMatchException("InlineInboundTransfersPaymentMethodDetailsUsBankAccountMandateX5ef0400d matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineInboundTransfersPaymentMethodDetailsUsBankAccountMandateX5ef0400d(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineInboundTransfersPaymentMethodDetailsUsBankAccountMandateX5ef0400d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineInboundTransfersPaymentMethodDetailsUsBankAccountMandateX5ef0400d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineInboundTransfersPaymentMethodDetailsUsBankAccountMandateX5ef0400d")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineInboundTransfersPaymentMethodDetailsUsBankAccountMandateX5ef0400d) {
      encoder.requireJsonEncoder("InlineInboundTransfersPaymentMethodDetailsUsBankAccountMandateX5ef0400d").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineInboundTransfersPaymentMethodDetailsUsBankAccountMandateX5ef0400d(element: JsonElement): InlineInboundTransfersPaymentMethodDetailsUsBankAccountMandateX5ef0400dInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesMandate = element.isJsonDecodable<Mandate>()
  return InlineInboundTransfersPaymentMethodDetailsUsBankAccountMandateX5ef0400dInspection(
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
