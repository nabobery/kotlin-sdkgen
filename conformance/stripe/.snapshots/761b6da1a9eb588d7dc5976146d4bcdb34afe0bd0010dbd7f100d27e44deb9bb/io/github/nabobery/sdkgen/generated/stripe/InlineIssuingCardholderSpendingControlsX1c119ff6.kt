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

public enum class InlineIssuingCardholderSpendingControlsX1c119ff6Branch {
  IssuingCardholderAuthorizationControls,
}

public sealed class InlineIssuingCardholderSpendingControlsX1c119ff6DecodingException(
  message: String,
) : SerializationException(message)

public class InlineIssuingCardholderSpendingControlsX1c119ff6NoMatchException(
  message: String,
) : InlineIssuingCardholderSpendingControlsX1c119ff6DecodingException(message)

internal data class InlineIssuingCardholderSpendingControlsX1c119ff6Inspection(
  public val matchesIssuingCardholderAuthorizationControls: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesIssuingCardholderAuthorizationControls).count { it }
}

/**
 * Rules that control spending across this cardholder's cards. Refer to our
 * [documentation](https://docs.stripe.com/issuing/controls/spending-controls) for more details.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing.cardholder/properties/spending_controls
 */
@Serializable(with = InlineIssuingCardholderSpendingControlsX1c119ff6.Serializer::class)
public class InlineIssuingCardholderSpendingControlsX1c119ff6 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineIssuingCardholderSpendingControlsX1c119ff6Inspection,
) {
  public val issuingCardholderAuthorizationControls: IssuingCardholderAuthorizationControlsView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesIssuingCardholderAuthorizationControls) json.decodeFromJsonElement<IssuingCardholderAuthorizationControlsView>(raw) else null }

  public val matchedBranches: Set<InlineIssuingCardholderSpendingControlsX1c119ff6Branch>
    get() = buildSet {
      if (inspection.matchesIssuingCardholderAuthorizationControls) add(InlineIssuingCardholderSpendingControlsX1c119ff6Branch.IssuingCardholderAuthorizationControls)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineIssuingCardholderSpendingControlsX1c119ff6 {
      val inspection = inspectInlineIssuingCardholderSpendingControlsX1c119ff6(raw)
      if (inspection.matchCount == 0) {
        throw InlineIssuingCardholderSpendingControlsX1c119ff6NoMatchException("InlineIssuingCardholderSpendingControlsX1c119ff6 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineIssuingCardholderSpendingControlsX1c119ff6(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineIssuingCardholderSpendingControlsX1c119ff6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineIssuingCardholderSpendingControlsX1c119ff6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineIssuingCardholderSpendingControlsX1c119ff6")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineIssuingCardholderSpendingControlsX1c119ff6) {
      encoder.requireJsonEncoder("InlineIssuingCardholderSpendingControlsX1c119ff6").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineIssuingCardholderSpendingControlsX1c119ff6(element: JsonElement): InlineIssuingCardholderSpendingControlsX1c119ff6Inspection {
  val raw = element as? JsonObject ?: return InlineIssuingCardholderSpendingControlsX1c119ff6Inspection(
    matchesIssuingCardholderAuthorizationControls = false,
    failures = listOf("IssuingCardholderAuthorizationControls: expected JSON object"),
  )
  val matchesIssuingCardholderAuthorizationControls = true
  return InlineIssuingCardholderSpendingControlsX1c119ff6Inspection(
    matchesIssuingCardholderAuthorizationControls = matchesIssuingCardholderAuthorizationControls,
    failures = buildList {
      if (!matchesIssuingCardholderAuthorizationControls) add("IssuingCardholderAuthorizationControls: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
