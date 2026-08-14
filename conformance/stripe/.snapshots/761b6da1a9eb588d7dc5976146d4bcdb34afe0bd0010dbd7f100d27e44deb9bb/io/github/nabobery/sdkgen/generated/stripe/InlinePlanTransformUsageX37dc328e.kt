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

public enum class InlinePlanTransformUsageX37dc328eBranch {
  TransformUsage,
}

public sealed class InlinePlanTransformUsageX37dc328eDecodingException(
  message: String,
) : SerializationException(message)

public class InlinePlanTransformUsageX37dc328eNoMatchException(
  message: String,
) : InlinePlanTransformUsageX37dc328eDecodingException(message)

internal data class InlinePlanTransformUsageX37dc328eInspection(
  public val matchesTransformUsage: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesTransformUsage).count { it }
}

/**
 * Apply a transformation to the reported usage or set quantity before computing the amount billed. Cannot be combined
 * with `tiers`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/plan/properties/transform_usage
 */
@Serializable(with = InlinePlanTransformUsageX37dc328e.Serializer::class)
public class InlinePlanTransformUsageX37dc328e internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePlanTransformUsageX37dc328eInspection,
) {
  public val transformUsage: TransformUsageView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesTransformUsage) json.decodeFromJsonElement<TransformUsageView>(raw) else null }

  public val matchedBranches: Set<InlinePlanTransformUsageX37dc328eBranch>
    get() = buildSet {
      if (inspection.matchesTransformUsage) add(InlinePlanTransformUsageX37dc328eBranch.TransformUsage)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePlanTransformUsageX37dc328e {
      val inspection = inspectInlinePlanTransformUsageX37dc328e(raw)
      if (inspection.matchCount == 0) {
        throw InlinePlanTransformUsageX37dc328eNoMatchException("InlinePlanTransformUsageX37dc328e matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePlanTransformUsageX37dc328e(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePlanTransformUsageX37dc328e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePlanTransformUsageX37dc328e {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePlanTransformUsageX37dc328e")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePlanTransformUsageX37dc328e) {
      encoder.requireJsonEncoder("InlinePlanTransformUsageX37dc328e").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePlanTransformUsageX37dc328e(element: JsonElement): InlinePlanTransformUsageX37dc328eInspection {
  val raw = element as? JsonObject ?: return InlinePlanTransformUsageX37dc328eInspection(
    matchesTransformUsage = false,
    failures = listOf("TransformUsage: expected JSON object"),
  )
  val matchesTransformUsage = raw["divide_by"] != null && raw["round"] != null
  return InlinePlanTransformUsageX37dc328eInspection(
    matchesTransformUsage = matchesTransformUsage,
    failures = buildList {
      if (!matchesTransformUsage) add("TransformUsage: required properties 'divide_by', 'round' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
