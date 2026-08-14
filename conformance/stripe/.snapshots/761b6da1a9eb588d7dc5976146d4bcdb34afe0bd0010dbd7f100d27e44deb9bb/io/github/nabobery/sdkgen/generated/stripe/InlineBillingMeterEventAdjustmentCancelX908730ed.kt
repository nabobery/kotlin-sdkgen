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

public enum class InlineBillingMeterEventAdjustmentCancelX908730edBranch {
  BillingMeterResourceBillingMeterEventAdjustmentCancel,
}

public sealed class InlineBillingMeterEventAdjustmentCancelX908730edDecodingException(
  message: String,
) : SerializationException(message)

public class InlineBillingMeterEventAdjustmentCancelX908730edNoMatchException(
  message: String,
) : InlineBillingMeterEventAdjustmentCancelX908730edDecodingException(message)

internal data class InlineBillingMeterEventAdjustmentCancelX908730edInspection(
  public val matchesBillingMeterResourceBillingMeterEventAdjustmentCancel: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBillingMeterResourceBillingMeterEventAdjustmentCancel).count { it }
}

/**
 * Specifies which event to cancel.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/billing.meter_event_adjustment/properties/cancel
 */
@Serializable(with = InlineBillingMeterEventAdjustmentCancelX908730ed.Serializer::class)
public class InlineBillingMeterEventAdjustmentCancelX908730ed internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineBillingMeterEventAdjustmentCancelX908730edInspection,
) {
  public val billingMeterResourceBillingMeterEventAdjustmentCancel:
      BillingMeterResourceBillingMeterEventAdjustmentCancelView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBillingMeterResourceBillingMeterEventAdjustmentCancel) json.decodeFromJsonElement<BillingMeterResourceBillingMeterEventAdjustmentCancelView>(raw) else null }

  public val matchedBranches: Set<InlineBillingMeterEventAdjustmentCancelX908730edBranch>
    get() = buildSet {
      if (inspection.matchesBillingMeterResourceBillingMeterEventAdjustmentCancel) add(InlineBillingMeterEventAdjustmentCancelX908730edBranch.BillingMeterResourceBillingMeterEventAdjustmentCancel)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineBillingMeterEventAdjustmentCancelX908730ed {
      val inspection = inspectInlineBillingMeterEventAdjustmentCancelX908730ed(raw)
      if (inspection.matchCount == 0) {
        throw InlineBillingMeterEventAdjustmentCancelX908730edNoMatchException("InlineBillingMeterEventAdjustmentCancelX908730ed matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineBillingMeterEventAdjustmentCancelX908730ed(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineBillingMeterEventAdjustmentCancelX908730ed> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineBillingMeterEventAdjustmentCancelX908730ed {
      val jsonDecoder = decoder.requireJsonDecoder("InlineBillingMeterEventAdjustmentCancelX908730ed")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineBillingMeterEventAdjustmentCancelX908730ed) {
      encoder.requireJsonEncoder("InlineBillingMeterEventAdjustmentCancelX908730ed").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineBillingMeterEventAdjustmentCancelX908730ed(element: JsonElement): InlineBillingMeterEventAdjustmentCancelX908730edInspection {
  val raw = element as? JsonObject ?: return InlineBillingMeterEventAdjustmentCancelX908730edInspection(
    matchesBillingMeterResourceBillingMeterEventAdjustmentCancel = false,
    failures = listOf("BillingMeterResourceBillingMeterEventAdjustmentCancel: expected JSON object"),
  )
  val matchesBillingMeterResourceBillingMeterEventAdjustmentCancel = true
  return InlineBillingMeterEventAdjustmentCancelX908730edInspection(
    matchesBillingMeterResourceBillingMeterEventAdjustmentCancel = matchesBillingMeterResourceBillingMeterEventAdjustmentCancel,
    failures = buildList {
      if (!matchesBillingMeterResourceBillingMeterEventAdjustmentCancel) add("BillingMeterResourceBillingMeterEventAdjustmentCancel: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
