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

public enum class InlinePriceRecurringX2e8687deBranch {
  Recurring,
}

public sealed class InlinePriceRecurringX2e8687deDecodingException(
  message: String,
) : SerializationException(message)

public class InlinePriceRecurringX2e8687deNoMatchException(
  message: String,
) : InlinePriceRecurringX2e8687deDecodingException(message)

internal data class InlinePriceRecurringX2e8687deInspection(
  public val matchesRecurring: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesRecurring).count { it }
}

/**
 * The recurring components of a price such as `interval` and `usage_type`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/price/properties/recurring
 */
@Serializable(with = InlinePriceRecurringX2e8687de.Serializer::class)
public class InlinePriceRecurringX2e8687de internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePriceRecurringX2e8687deInspection,
) {
  public val recurring: RecurringView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesRecurring) json.decodeFromJsonElement<RecurringView>(raw) else null }

  public val matchedBranches: Set<InlinePriceRecurringX2e8687deBranch>
    get() = buildSet {
      if (inspection.matchesRecurring) add(InlinePriceRecurringX2e8687deBranch.Recurring)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePriceRecurringX2e8687de {
      val inspection = inspectInlinePriceRecurringX2e8687de(raw)
      if (inspection.matchCount == 0) {
        throw InlinePriceRecurringX2e8687deNoMatchException("InlinePriceRecurringX2e8687de matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePriceRecurringX2e8687de(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePriceRecurringX2e8687de> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePriceRecurringX2e8687de {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePriceRecurringX2e8687de")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePriceRecurringX2e8687de) {
      encoder.requireJsonEncoder("InlinePriceRecurringX2e8687de").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePriceRecurringX2e8687de(element: JsonElement): InlinePriceRecurringX2e8687deInspection {
  val raw = element as? JsonObject ?: return InlinePriceRecurringX2e8687deInspection(
    matchesRecurring = false,
    failures = listOf("Recurring: expected JSON object"),
  )
  val matchesRecurring = raw["interval"] != null && raw["interval_count"] != null && raw["usage_type"] != null
  return InlinePriceRecurringX2e8687deInspection(
    matchesRecurring = matchesRecurring,
    failures = buildList {
      if (!matchesRecurring) add("Recurring: required properties 'interval', 'interval_count', 'usage_type' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
