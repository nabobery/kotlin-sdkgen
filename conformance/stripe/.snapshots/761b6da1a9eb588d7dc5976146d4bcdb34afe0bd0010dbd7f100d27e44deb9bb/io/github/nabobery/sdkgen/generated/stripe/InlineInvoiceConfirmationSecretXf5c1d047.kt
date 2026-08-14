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
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineInvoiceConfirmationSecretXf5c1d047Branch {
  InvoicesResourceConfirmationSecret,
}

public sealed class InlineInvoiceConfirmationSecretXf5c1d047DecodingException(
  message: String,
) : SerializationException(message)

public class InlineInvoiceConfirmationSecretXf5c1d047NoMatchException(
  message: String,
) : InlineInvoiceConfirmationSecretXf5c1d047DecodingException(message)

internal data class InlineInvoiceConfirmationSecretXf5c1d047Inspection(
  public val matchesInvoicesResourceConfirmationSecret: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInvoicesResourceConfirmationSecret).count { it }
}

/**
 * The confirmation secret associated with this invoice. Currently, this contains the client_secret of the PaymentIntent
 * that Stripe creates during invoice finalization.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoice/properties/confirmation_secret
 */
@Serializable(with = InlineInvoiceConfirmationSecretXf5c1d047.Serializer::class)
public class InlineInvoiceConfirmationSecretXf5c1d047 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineInvoiceConfirmationSecretXf5c1d047Inspection,
) {
  public val invoicesResourceConfirmationSecret: InvoicesResourceConfirmationSecretView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInvoicesResourceConfirmationSecret) json.decodeFromJsonElement<InvoicesResourceConfirmationSecretView>(raw) else null }

  public val matchedBranches: Set<InlineInvoiceConfirmationSecretXf5c1d047Branch>
    get() = buildSet {
      if (inspection.matchesInvoicesResourceConfirmationSecret) add(InlineInvoiceConfirmationSecretXf5c1d047Branch.InvoicesResourceConfirmationSecret)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineInvoiceConfirmationSecretXf5c1d047 {
      val inspection = inspectInlineInvoiceConfirmationSecretXf5c1d047(raw)
      if (inspection.matchCount == 0) {
        throw InlineInvoiceConfirmationSecretXf5c1d047NoMatchException("InlineInvoiceConfirmationSecretXf5c1d047 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineInvoiceConfirmationSecretXf5c1d047(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineInvoiceConfirmationSecretXf5c1d047> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineInvoiceConfirmationSecretXf5c1d047 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineInvoiceConfirmationSecretXf5c1d047")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineInvoiceConfirmationSecretXf5c1d047) {
      encoder.requireJsonEncoder("InlineInvoiceConfirmationSecretXf5c1d047").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineInvoiceConfirmationSecretXf5c1d047(element: JsonElement): InlineInvoiceConfirmationSecretXf5c1d047Inspection {
  val raw = element as? JsonObject ?: return InlineInvoiceConfirmationSecretXf5c1d047Inspection(
    matchesInvoicesResourceConfirmationSecret = false,
    failures = listOf("InvoicesResourceConfirmationSecret: expected JSON object"),
  )
  val matchesInvoicesResourceConfirmationSecret = raw["client_secret"].isString() && raw["type"].isString()
  return InlineInvoiceConfirmationSecretXf5c1d047Inspection(
    matchesInvoicesResourceConfirmationSecret = matchesInvoicesResourceConfirmationSecret,
    failures = buildList {
      if (!matchesInvoicesResourceConfirmationSecret) add("InvoicesResourceConfirmationSecret: required properties 'client_secret', 'type' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
