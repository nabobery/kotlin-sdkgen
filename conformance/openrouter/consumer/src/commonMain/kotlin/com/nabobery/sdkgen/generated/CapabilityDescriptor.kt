package com.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

public sealed class CapabilityDescriptorDecodingException(
  message: String,
) : SerializationException(message)

public class CapabilityDescriptorNoMatchException(
  message: String,
) : CapabilityDescriptorDecodingException(message)

public class CapabilityDescriptorAmbiguityException(
  message: String,
) : CapabilityDescriptorDecodingException(message)

/**
 * A typed descriptor for one supported request parameter.
 */
@Serializable(with = CapabilityDescriptor.Serializer::class)
public sealed interface CapabilityDescriptor {
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonObject

  public class EnumCapability internal constructor(
    public val type: InlineComponentsSchemasEnumCapabilityPropertiesType,
    public val values: List<String>,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : CapabilityDescriptor {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(type: InlineComponentsSchemasEnumCapabilityPropertiesType, values: List<String>): EnumCapability =
        EnumCapability(
        type = type,
        values = values,
        raw = buildJsonObject {
          put("type", "enum")
          put("values", SdkJson.encodeToJsonElement(values))
        },
      )
    }
  }

  public class RangeCapability internal constructor(
    public val max: Double,
    public val min: Double,
    public val type: InlineComponentsSchemasRangeCapabilityPropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : CapabilityDescriptor {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        max: Double,
        min: Double,
        type: InlineComponentsSchemasRangeCapabilityPropertiesType,
      ): RangeCapability = RangeCapability(
        max = max,
        min = min,
        type = type,
        raw = buildJsonObject {
          put("max", SdkJson.encodeToJsonElement(max))
          put("min", SdkJson.encodeToJsonElement(min))
          put("type", "range")
        },
      )
    }
  }

  public class BooleanCapability internal constructor(
    public val type: InlineComponentsSchemasBooleanCapabilityPropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : CapabilityDescriptor {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(type: InlineComponentsSchemasBooleanCapabilityPropertiesType): BooleanCapability =
        BooleanCapability(
        type = type,
        raw = buildJsonObject {
          put("type", "boolean")
        },
      )
    }
  }

  public object Serializer : KSerializer<CapabilityDescriptor> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CapabilityDescriptor {
      val jsonDecoder = decoder.requireJsonDecoder("CapabilityDescriptor")
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw CapabilityDescriptorNoMatchException("CapabilityDescriptor matched 0 branches: expected JSON object")
      val matches = inspectCapabilityDescriptor(raw)
      if (matches.size == 0) {
        throw CapabilityDescriptorNoMatchException("CapabilityDescriptor matched 0 branches: " + matches.failures
          .joinToString("; "))
      }
      if (matches.size > 1) {
        throw CapabilityDescriptorAmbiguityException("CapabilityDescriptor matched " + matches.size +
          " branches; expected exactly 1: " + matches.names.joinToString())
      }
      return when {
        matches.typeState2Matches && matches.valuesDecoded -> EnumCapability(type = requireNotNull(matches.typeState2),
          values = requireNotNull(matches.values), raw = raw)
        matches.typeState3Matches && matches.maxDecoded && matches.minDecoded -> RangeCapability(max =
          requireNotNull(matches.max), min = requireNotNull(matches.min), type = requireNotNull(matches.typeState3),
            raw = raw)
        matches.typeState1Matches -> BooleanCapability(type = requireNotNull(matches.typeState1), raw = raw)
        else -> error("unreachable")
      }
    }

    override fun serialize(encoder: Encoder, `value`: CapabilityDescriptor) {
      encoder.requireJsonEncoder("CapabilityDescriptor").encodeJsonElement(value.raw)
    }
  }
}

private data class CapabilityDescriptorInspection(
  public val typeState2: InlineComponentsSchemasEnumCapabilityPropertiesType?,
  public val typeState2Decoded: Boolean,
  public val typeState2Matches: Boolean,
  public val values: List<String>?,
  public val valuesDecoded: Boolean,
  public val typeState3: InlineComponentsSchemasRangeCapabilityPropertiesType?,
  public val typeState3Decoded: Boolean,
  public val typeState3Matches: Boolean,
  public val max: Double?,
  public val maxDecoded: Boolean,
  public val min: Double?,
  public val minDecoded: Boolean,
  public val typeState1: InlineComponentsSchemasBooleanCapabilityPropertiesType?,
  public val typeState1Decoded: Boolean,
  public val typeState1Matches: Boolean,
  public val failures: List<String>,
) {
  public val names: List<String>
    get() = buildList {
      if (typeState2Matches && valuesDecoded) add("EnumCapability")
      if (typeState3Matches && maxDecoded && minDecoded) add("RangeCapability")
      if (typeState1Matches) add("BooleanCapability")
    }

  public val size: Int
    get() = names.size
}

private fun inspectCapabilityDescriptor(raw: JsonObject): CapabilityDescriptorInspection {
  val typeState2Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasEnumCapabilityPropertiesType>(element) } }
  val typeState2 = typeState2Result?.getOrNull()
  val typeState2Decoded = typeState2Result?.isSuccess == true
  val typeState2Matches = raw.stringValue("type") == "enum" && typeState2Decoded
  val valuesResult = raw["values"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<List<String>>(element) } }
  val values = valuesResult?.getOrNull()
  val valuesDecoded = valuesResult?.isSuccess == true
  val typeState3Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasRangeCapabilityPropertiesType>(element) } }
  val typeState3 = typeState3Result?.getOrNull()
  val typeState3Decoded = typeState3Result?.isSuccess == true
  val typeState3Matches = raw.stringValue("type") == "range" && typeState3Decoded
  val maxResult = raw["max"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<Double>(element) } }
  val max = maxResult?.getOrNull()
  val maxDecoded = maxResult?.isSuccess == true
  val minResult = raw["min"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<Double>(element) } }
  val min = minResult?.getOrNull()
  val minDecoded = minResult?.isSuccess == true
  val typeState1Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasBooleanCapabilityPropertiesType>(element) } }
  val typeState1 = typeState1Result?.getOrNull()
  val typeState1Decoded = typeState1Result?.isSuccess == true
  val typeState1Matches = raw.stringValue("type") == "boolean" && typeState1Decoded
  return CapabilityDescriptorInspection(
    typeState2 = typeState2,
    typeState2Decoded = typeState2Decoded,
    typeState2Matches = typeState2Matches,
    values = values,
    valuesDecoded = valuesDecoded,
    typeState3 = typeState3,
    typeState3Decoded = typeState3Decoded,
    typeState3Matches = typeState3Matches,
    max = max,
    maxDecoded = maxDecoded,
    min = min,
    minDecoded = minDecoded,
    typeState1 = typeState1,
    typeState1Decoded = typeState1Decoded,
    typeState1Matches = typeState1Matches,
    failures = buildList {
      if (!typeState2Matches ||
        !valuesDecoded) add("EnumCapability: required properties 'type' and 'values' do not match their declared types")
      if (!typeState3Matches || !maxDecoded ||
        !minDecoded) add("RangeCapability: required properties 'type' and 'max' and 'min' do not match their declared " +
          "types")
      if (!typeState1Matches) add("BooleanCapability: required properties 'type' do not match their declared types")
    },
  )
}

private fun JsonObject.stringValue(name: String): String? {
  val primitive = this[name] as? JsonPrimitive ?: return null
  return primitive.takeIf { it.isString }?.content
}
