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

public enum class InlinePaymentMethodDetailsPaymentRecordUsBankAccountMandateX66eea151Branch {
  Branch1,
  Mandate,
}

public sealed class InlinePaymentMethodDetailsPaymentRecordUsBankAccountMandateX66eea151DecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentMethodDetailsPaymentRecordUsBankAccountMandateX66eea151NoMatchException(
  message: String,
) : InlinePaymentMethodDetailsPaymentRecordUsBankAccountMandateX66eea151DecodingException(message)

internal data class InlinePaymentMethodDetailsPaymentRecordUsBankAccountMandateX66eea151Inspection(
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
 * sdkgen://source/openapi.json#/components/schemas/payment_method_details_payment_record_us_bank_account/properties/man
 * date
 */
@Serializable(with = InlinePaymentMethodDetailsPaymentRecordUsBankAccountMandateX66eea151.Serializer::class)
public class InlinePaymentMethodDetailsPaymentRecordUsBankAccountMandateX66eea151 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlinePaymentMethodDetailsPaymentRecordUsBankAccountMandateX66eea151Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val mandate: Mandate? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesMandate) json.decodeFromJsonElement<Mandate>(raw) else null }

  public val matchedBranches:
      Set<InlinePaymentMethodDetailsPaymentRecordUsBankAccountMandateX66eea151Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlinePaymentMethodDetailsPaymentRecordUsBankAccountMandateX66eea151Branch.Branch1)
      if (inspection.matchesMandate) add(InlinePaymentMethodDetailsPaymentRecordUsBankAccountMandateX66eea151Branch.Mandate)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentMethodDetailsPaymentRecordUsBankAccountMandateX66eea151 {
      val inspection = inspectInlinePaymentMethodDetailsPaymentRecordUsBankAccountMandateX66eea151(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentMethodDetailsPaymentRecordUsBankAccountMandateX66eea151NoMatchException("InlinePaymentMethodDetailsPaymentRecordUsBankAccountMandateX66eea151 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentMethodDetailsPaymentRecordUsBankAccountMandateX66eea151(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentMethodDetailsPaymentRecordUsBankAccountMandateX66eea151> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentMethodDetailsPaymentRecordUsBankAccountMandateX66eea151 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentMethodDetailsPaymentRecordUsBankAccountMandateX66eea151")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentMethodDetailsPaymentRecordUsBankAccountMandateX66eea151) {
      encoder.requireJsonEncoder("InlinePaymentMethodDetailsPaymentRecordUsBankAccountMandateX66eea151").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentMethodDetailsPaymentRecordUsBankAccountMandateX66eea151(element: JsonElement): InlinePaymentMethodDetailsPaymentRecordUsBankAccountMandateX66eea151Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesMandate = element.isJsonDecodable<Mandate>()
  return InlinePaymentMethodDetailsPaymentRecordUsBankAccountMandateX66eea151Inspection(
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
