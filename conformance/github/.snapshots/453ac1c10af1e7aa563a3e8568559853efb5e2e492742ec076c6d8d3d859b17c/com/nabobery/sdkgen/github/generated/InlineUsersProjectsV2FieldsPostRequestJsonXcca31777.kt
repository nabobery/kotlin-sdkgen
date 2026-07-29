package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Pair
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

public sealed class InlineUsersProjectsV2FieldsPostRequestJsonXcca31777DecodingException(
  message: String,
) : SerializationException(message)

public class InlineUsersProjectsV2FieldsPostRequestJsonXcca31777NoMatchException(
  message: String,
) : InlineUsersProjectsV2FieldsPostRequestJsonXcca31777DecodingException(message)

public class InlineUsersProjectsV2FieldsPostRequestJsonXcca31777AmbiguityException(
  message: String,
) : InlineUsersProjectsV2FieldsPostRequestJsonXcca31777DecodingException(message)

public class InlineUsersProjectsV2FieldsPostRequestJsonXcca31777BranchValidationException(
  message: String,
) : InlineUsersProjectsV2FieldsPostRequestJsonXcca31777DecodingException(message)

/**
 * Closed oneOf union for
 * sdkgen://source/openapi.yaml#/paths/~1users~1{username}~1projectsV2~1{project_number}~1fields/post/requestBody/conten
 * t/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1users~1{username}~1projectsV2~1{project_number}~1fields/post/requestBody/conten
 * t/application~1json/schema
 */
@Serializable(with = InlineUsersProjectsV2FieldsPostRequestJsonXcca31777.Serializer::class)
public sealed interface InlineUsersProjectsV2FieldsPostRequestJsonXcca31777 {
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonObject

  public class InlineUsersProjectsV2FieldsPostRequestJsonOneOf1X5efc230e internal constructor(
    public val dataType: InlineUsersProjectsV2FieldsPostRequestJsonOneOf1DataTypeX8260e3c9,
    public val name: String,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineUsersProjectsV2FieldsPostRequestJsonXcca31777 {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(dataType: InlineUsersProjectsV2FieldsPostRequestJsonOneOf1DataTypeX8260e3c9, name: String): InlineUsersProjectsV2FieldsPostRequestJsonOneOf1X5efc230e {
        val raw = buildJsonObject {
          put("data_type", SdkJson.encodeToJsonElement(dataType))
          put("name", name)
        }
        val inspection = inspectInlineUsersProjectsV2FieldsPostRequestJsonXcca31777(raw)
        if (inspection.size == 0) {
          throw InlineUsersProjectsV2FieldsPostRequestJsonXcca31777NoMatchException("InlineUsersProjectsV2FieldsPostRequestJsonXcca31777 matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.inlineUsersProjectsV2FieldsPostRequestJsonOneOf1X5efc230eMatches) {
          throw InlineUsersProjectsV2FieldsPostRequestJsonXcca31777BranchValidationException("InlineUsersProjectsV2FieldsPostRequestJsonOneOf1X5efc230e factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw InlineUsersProjectsV2FieldsPostRequestJsonXcca31777AmbiguityException("InlineUsersProjectsV2FieldsPostRequestJsonXcca31777 matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return InlineUsersProjectsV2FieldsPostRequestJsonOneOf1X5efc230e(
          dataType = dataType,
          name = name,
          raw = raw,
        )
      }
    }
  }

  public class InlineUsersProjectsV2FieldsPostRequestJsonOneOf2X5158768a internal constructor(
    public val dataType: InlineUsersProjectsV2FieldsPostRequestJsonOneOf2DataTypeX72194ad5,
    public val name: String,
    singleSelectOptions: List<ProjectsV2FieldSingleSelectOption>,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineUsersProjectsV2FieldsPostRequestJsonXcca31777 {
    public val singleSelectOptions: List<ProjectsV2FieldSingleSelectOption> =
        singleSelectOptions.toList()

    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        dataType: InlineUsersProjectsV2FieldsPostRequestJsonOneOf2DataTypeX72194ad5,
        name: String,
        singleSelectOptions: List<ProjectsV2FieldSingleSelectOption>,
      ): InlineUsersProjectsV2FieldsPostRequestJsonOneOf2X5158768a {
        val singleSelectOptionsOwnershipSnapshot = singleSelectOptions.toList()
        val raw = buildJsonObject {
          put("data_type", SdkJson.encodeToJsonElement(dataType))
          put("name", name)
          put("single_select_options", SdkJson.encodeToJsonElement(singleSelectOptionsOwnershipSnapshot))
        }
        val inspection = inspectInlineUsersProjectsV2FieldsPostRequestJsonXcca31777(raw)
        if (inspection.size == 0) {
          throw InlineUsersProjectsV2FieldsPostRequestJsonXcca31777NoMatchException("InlineUsersProjectsV2FieldsPostRequestJsonXcca31777 matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.inlineUsersProjectsV2FieldsPostRequestJsonOneOf2X5158768aMatches) {
          throw InlineUsersProjectsV2FieldsPostRequestJsonXcca31777BranchValidationException("InlineUsersProjectsV2FieldsPostRequestJsonOneOf2X5158768a factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw InlineUsersProjectsV2FieldsPostRequestJsonXcca31777AmbiguityException("InlineUsersProjectsV2FieldsPostRequestJsonXcca31777 matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return InlineUsersProjectsV2FieldsPostRequestJsonOneOf2X5158768a(
          dataType = dataType,
          name = name,
          singleSelectOptions = singleSelectOptionsOwnershipSnapshot,
          raw = raw,
        )
      }
    }
  }

  public class InlineUsersProjectsV2FieldsPostRequestJsonOneOf3Xf2916651 internal constructor(
    public val dataType: InlineUsersProjectsV2FieldsPostRequestJsonOneOf3DataTypeXbce44741,
    public val iterationConfiguration: ProjectsV2FieldIterationConfiguration,
    public val name: String,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineUsersProjectsV2FieldsPostRequestJsonXcca31777 {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        dataType: InlineUsersProjectsV2FieldsPostRequestJsonOneOf3DataTypeXbce44741,
        iterationConfiguration: ProjectsV2FieldIterationConfiguration,
        name: String,
      ): InlineUsersProjectsV2FieldsPostRequestJsonOneOf3Xf2916651 {
        val raw = buildJsonObject {
          put("data_type", SdkJson.encodeToJsonElement(dataType))
          put("iteration_configuration", SdkJson.encodeToJsonElement(iterationConfiguration))
          put("name", name)
        }
        val inspection = inspectInlineUsersProjectsV2FieldsPostRequestJsonXcca31777(raw)
        if (inspection.size == 0) {
          throw InlineUsersProjectsV2FieldsPostRequestJsonXcca31777NoMatchException("InlineUsersProjectsV2FieldsPostRequestJsonXcca31777 matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.inlineUsersProjectsV2FieldsPostRequestJsonOneOf3Xf2916651Matches) {
          throw InlineUsersProjectsV2FieldsPostRequestJsonXcca31777BranchValidationException("InlineUsersProjectsV2FieldsPostRequestJsonOneOf3Xf2916651 factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw InlineUsersProjectsV2FieldsPostRequestJsonXcca31777AmbiguityException("InlineUsersProjectsV2FieldsPostRequestJsonXcca31777 matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return InlineUsersProjectsV2FieldsPostRequestJsonOneOf3Xf2916651(
          dataType = dataType,
          iterationConfiguration = iterationConfiguration,
          name = name,
          raw = raw,
        )
      }
    }
  }

  public object Serializer : KSerializer<InlineUsersProjectsV2FieldsPostRequestJsonXcca31777> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineUsersProjectsV2FieldsPostRequestJsonXcca31777 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineUsersProjectsV2FieldsPostRequestJsonXcca31777")
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw InlineUsersProjectsV2FieldsPostRequestJsonXcca31777NoMatchException("InlineUsersProjectsV2FieldsPostRequestJsonXcca31777 matched 0 branches: expected JSON object")
      val matches = inspectInlineUsersProjectsV2FieldsPostRequestJsonXcca31777(rawObject)
      if (matches.size == 0) {
        throw InlineUsersProjectsV2FieldsPostRequestJsonXcca31777NoMatchException("InlineUsersProjectsV2FieldsPostRequestJsonXcca31777 matched 0 branches: " + matches.failures.joinToString("; "))
      }
      if (matches.size > 1) {
        throw InlineUsersProjectsV2FieldsPostRequestJsonXcca31777AmbiguityException("InlineUsersProjectsV2FieldsPostRequestJsonXcca31777 matched " + matches.size + " branches; expected exactly 1: " + matches.names.joinToString())
      }
      return when {
        matches.inlineUsersProjectsV2FieldsPostRequestJsonOneOf1X5efc230eMatches -> InlineUsersProjectsV2FieldsPostRequestJsonOneOf1X5efc230e(dataType = requireNotNull(matches.dataTypeState1), name = requireNotNull(matches.name), raw = rawObject)
        matches.inlineUsersProjectsV2FieldsPostRequestJsonOneOf2X5158768aMatches -> InlineUsersProjectsV2FieldsPostRequestJsonOneOf2X5158768a(dataType = requireNotNull(matches.dataTypeState2), name = requireNotNull(matches.name), singleSelectOptions = requireNotNull(matches.singleSelectOptions), raw = rawObject)
        matches.inlineUsersProjectsV2FieldsPostRequestJsonOneOf3Xf2916651Matches -> InlineUsersProjectsV2FieldsPostRequestJsonOneOf3Xf2916651(dataType = requireNotNull(matches.dataTypeState3), iterationConfiguration = requireNotNull(matches.iterationConfiguration), name = requireNotNull(matches.name), raw = rawObject)
        else -> error("unreachable")
      }
    }

    override fun serialize(encoder: Encoder, `value`: InlineUsersProjectsV2FieldsPostRequestJsonXcca31777) {
      encoder.requireJsonEncoder("InlineUsersProjectsV2FieldsPostRequestJsonXcca31777").encodeJsonElement(value.raw)
    }
  }
}

internal data class InlineUsersProjectsV2FieldsPostRequestJsonXcca31777Inspection(
  public val dataTypeState1: InlineUsersProjectsV2FieldsPostRequestJsonOneOf1DataTypeX8260e3c9?,
  public val dataTypeState1Decoded: Boolean,
  public val dataTypeState1Matches: Boolean,
  public val name: String?,
  public val nameDecoded: Boolean,
  public val dataTypeState2: InlineUsersProjectsV2FieldsPostRequestJsonOneOf2DataTypeX72194ad5?,
  public val dataTypeState2Decoded: Boolean,
  public val dataTypeState2Matches: Boolean,
  public val singleSelectOptions: List<ProjectsV2FieldSingleSelectOption>?,
  public val singleSelectOptionsDecoded: Boolean,
  public val dataTypeState3: InlineUsersProjectsV2FieldsPostRequestJsonOneOf3DataTypeXbce44741?,
  public val dataTypeState3Decoded: Boolean,
  public val dataTypeState3Matches: Boolean,
  public val iterationConfiguration: ProjectsV2FieldIterationConfiguration?,
  public val iterationConfigurationDecoded: Boolean,
  public val inlineUsersProjectsV2FieldsPostRequestJsonOneOf1X5efc230eMatches: Boolean,
  public val inlineUsersProjectsV2FieldsPostRequestJsonOneOf2X5158768aMatches: Boolean,
  public val inlineUsersProjectsV2FieldsPostRequestJsonOneOf3Xf2916651Matches: Boolean,
  public val rawEmpty: Boolean,
  public val failures: List<String>,
) {
  public val names: List<String>
    get() = buildList {
      if (inlineUsersProjectsV2FieldsPostRequestJsonOneOf1X5efc230eMatches) add("InlineUsersProjectsV2FieldsPostRequestJsonOneOf1X5efc230e")
      if (inlineUsersProjectsV2FieldsPostRequestJsonOneOf2X5158768aMatches) add("InlineUsersProjectsV2FieldsPostRequestJsonOneOf2X5158768a")
      if (inlineUsersProjectsV2FieldsPostRequestJsonOneOf3Xf2916651Matches) add("InlineUsersProjectsV2FieldsPostRequestJsonOneOf3Xf2916651")
    }

  public val size: Int
    get() = names.size
}

private fun inspectInlineUsersProjectsV2FieldsPostRequestJsonXcca31777(rawObject: JsonObject): InlineUsersProjectsV2FieldsPostRequestJsonXcca31777Inspection {
  val dataTypeState1Result = rawObject["data_type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineUsersProjectsV2FieldsPostRequestJsonOneOf1DataTypeX8260e3c9>(element) } }
  val dataTypeState1 = dataTypeState1Result?.getOrNull()
  val dataTypeState1Decoded = dataTypeState1Result?.isSuccess == true
  val dataTypeState1Matches = (rawObject.stringValue("data_type") == "date" || rawObject.stringValue("data_type") == "number" || rawObject.stringValue("data_type") == "text") && dataTypeState1Decoded
  val nameResult = rawObject["name"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val name = nameResult?.getOrNull()
  val nameDecoded = nameResult?.isSuccess == true
  val dataTypeState2Result = rawObject["data_type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineUsersProjectsV2FieldsPostRequestJsonOneOf2DataTypeX72194ad5>(element) } }
  val dataTypeState2 = dataTypeState2Result?.getOrNull()
  val dataTypeState2Decoded = dataTypeState2Result?.isSuccess == true
  val dataTypeState2Matches = (rawObject.stringValue("data_type") == "single_select") && dataTypeState2Decoded
  val singleSelectOptionsResult = rawObject["single_select_options"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<List<ProjectsV2FieldSingleSelectOption>>(element) } }
  val singleSelectOptions = singleSelectOptionsResult?.getOrNull()
  val singleSelectOptionsDecoded = singleSelectOptionsResult?.isSuccess == true
  val dataTypeState3Result = rawObject["data_type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineUsersProjectsV2FieldsPostRequestJsonOneOf3DataTypeXbce44741>(element) } }
  val dataTypeState3 = dataTypeState3Result?.getOrNull()
  val dataTypeState3Decoded = dataTypeState3Result?.isSuccess == true
  val dataTypeState3Matches = (rawObject.stringValue("data_type") == "iteration") && dataTypeState3Decoded
  val iterationConfigurationResult = rawObject["iteration_configuration"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<ProjectsV2FieldIterationConfiguration>(element) } }
  val iterationConfiguration = iterationConfigurationResult?.getOrNull()
  val iterationConfigurationDecoded = iterationConfigurationResult?.isSuccess == true
  val rawEmpty = rawObject.isEmpty()
  val inlineUsersProjectsV2FieldsPostRequestJsonOneOf1X5efc230eMatches = matchesInlineUsersProjectsV2FieldsPostRequestJsonXcca31777InlineUsersProjectsV2FieldsPostRequestJsonOneOf1X5efc230eBranch(rawObject)
  val inlineUsersProjectsV2FieldsPostRequestJsonOneOf2X5158768aMatches = matchesInlineUsersProjectsV2FieldsPostRequestJsonXcca31777InlineUsersProjectsV2FieldsPostRequestJsonOneOf2X5158768aBranch(rawObject)
  val inlineUsersProjectsV2FieldsPostRequestJsonOneOf3Xf2916651Matches = matchesInlineUsersProjectsV2FieldsPostRequestJsonXcca31777InlineUsersProjectsV2FieldsPostRequestJsonOneOf3Xf2916651Branch(rawObject)
  return InlineUsersProjectsV2FieldsPostRequestJsonXcca31777Inspection(
    dataTypeState1 = dataTypeState1,
    dataTypeState1Decoded = dataTypeState1Decoded,
    dataTypeState1Matches = dataTypeState1Matches,
    name = name,
    nameDecoded = nameDecoded,
    dataTypeState2 = dataTypeState2,
    dataTypeState2Decoded = dataTypeState2Decoded,
    dataTypeState2Matches = dataTypeState2Matches,
    singleSelectOptions = singleSelectOptions,
    singleSelectOptionsDecoded = singleSelectOptionsDecoded,
    dataTypeState3 = dataTypeState3,
    dataTypeState3Decoded = dataTypeState3Decoded,
    dataTypeState3Matches = dataTypeState3Matches,
    iterationConfiguration = iterationConfiguration,
    iterationConfigurationDecoded = iterationConfigurationDecoded,
    inlineUsersProjectsV2FieldsPostRequestJsonOneOf1X5efc230eMatches = inlineUsersProjectsV2FieldsPostRequestJsonOneOf1X5efc230eMatches,
    inlineUsersProjectsV2FieldsPostRequestJsonOneOf2X5158768aMatches = inlineUsersProjectsV2FieldsPostRequestJsonOneOf2X5158768aMatches,
    inlineUsersProjectsV2FieldsPostRequestJsonOneOf3Xf2916651Matches = inlineUsersProjectsV2FieldsPostRequestJsonOneOf3Xf2916651Matches,
    rawEmpty = rawEmpty,
    failures = buildList {
      if (!inlineUsersProjectsV2FieldsPostRequestJsonOneOf1X5efc230eMatches) add("InlineUsersProjectsV2FieldsPostRequestJsonOneOf1X5efc230e: branch predicate did not match properties 'data_type' and 'name'")
      if (!inlineUsersProjectsV2FieldsPostRequestJsonOneOf2X5158768aMatches) add("InlineUsersProjectsV2FieldsPostRequestJsonOneOf2X5158768a: branch predicate did not match properties 'data_type' and 'name' and 'single_select_options'")
      if (!inlineUsersProjectsV2FieldsPostRequestJsonOneOf3Xf2916651Matches) add("InlineUsersProjectsV2FieldsPostRequestJsonOneOf3Xf2916651: branch predicate did not match properties 'data_type' and 'iteration_configuration' and 'name'")
    },
  )
}

private fun matchesInlineUsersProjectsV2FieldsPostRequestJsonXcca31777InlineUsersProjectsV2FieldsPostRequestJsonOneOf1X5efc230eBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("data_type") && (rawObject as JsonObject).containsKey("name") && ((rawObject as JsonObject)["data_type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"text\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"number\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"date\"")))) } ?: true) && ((rawObject as JsonObject)["name"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && (rawObject as JsonObject).keys.all { it in setOf("data_type", "name") })))

private fun matchesInlineUsersProjectsV2FieldsPostRequestJsonXcca31777InlineUsersProjectsV2FieldsPostRequestJsonOneOf2X5158768aBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("data_type") && (rawObject as JsonObject).containsKey("name") && (rawObject as JsonObject).containsKey("single_select_options") && ((rawObject as JsonObject)["data_type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"single_select\"")))) } ?: true) && ((rawObject as JsonObject)["name"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["single_select_options"]?.let { property -> (property is JsonArray && (property !is JsonArray || ((property as JsonArray).all { item -> (item is JsonObject && (item !is JsonObject || (((item as JsonObject)["color"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"BLUE\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"GRAY\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"GREEN\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"ORANGE\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"PINK\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"PURPLE\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"RED\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"YELLOW\"")))) } ?: true) && ((item as JsonObject)["description"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((item as JsonObject)["name"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && (item as JsonObject).keys.all { it in setOf("color", "description", "name") }))) }))) } ?: true) && (rawObject as JsonObject).keys.all { it in setOf("data_type", "name", "single_select_options") })))

private fun matchesInlineUsersProjectsV2FieldsPostRequestJsonXcca31777InlineUsersProjectsV2FieldsPostRequestJsonOneOf3Xf2916651Branch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("data_type") && (rawObject as JsonObject).containsKey("iteration_configuration") && (rawObject as JsonObject).containsKey("name") && ((rawObject as JsonObject)["data_type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"iteration\"")))) } ?: true) && ((rawObject as JsonObject)["iteration_configuration"]?.let { property -> (property is JsonObject && (property !is JsonObject || (((property as JsonObject)["duration"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && ((property as JsonObject)["iterations"]?.let { property -> (property is JsonArray && (property !is JsonArray || ((property as JsonArray).all { item -> (item is JsonObject && (item !is JsonObject || (((item as JsonObject)["duration"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && ((item as JsonObject)["start_date"]?.let { property -> (property is JsonPrimitive && property.isString && property.matchesJsonSchemaString(null, null, "date")) } ?: true) && ((item as JsonObject)["title"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && (item as JsonObject).keys.all { it in setOf("duration", "start_date", "title") }))) }))) } ?: true) && ((property as JsonObject)["start_date"]?.let { property -> (property is JsonPrimitive && property.isString && property.matchesJsonSchemaString(null, null, "date")) } ?: true)))) } ?: true) && ((rawObject as JsonObject)["name"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && (rawObject as JsonObject).keys.all { it in setOf("data_type", "iteration_configuration", "name") })))

private fun schemaExactDecimal(`value`: String): SchemaDecimal? {
  val match = Regex("^(-?)(0|[1-9]\\d*)(?:\\.(\\d+))?(?:[eE]([+-]?\\d+))?$").matchEntire(value) ?: return null
  var digits = (match.groupValues[2] + match.groupValues[3]).trimStart('0').ifEmpty { "0" }
  if (digits == "0") return SchemaDecimal(false, "0", SchemaInteger(false, "0"))
  var scale = schemaIntegerSubtract(
      SchemaInteger(false, match.groupValues[3].length.toString()),
      requireNotNull(schemaInteger(match.groupValues[4].ifEmpty { "0" })),
  )
  while (digits.length > 1 && digits.endsWith('0')) {
      digits = digits.dropLast(1)
      scale = schemaIntegerSubtract(scale, SchemaInteger(false, "1"))
  }
  return SchemaDecimal(match.groupValues[1] == "-", digits, scale)
}

private fun schemaInteger(`value`: String): SchemaInteger? {
  val match = Regex("^([+-]?)(\\d+)$").matchEntire(value) ?: return null
  val digits = match.groupValues[2].trimStart('0').ifEmpty { "0" }
  return SchemaInteger(match.groupValues[1] == "-" && digits != "0", digits)
}

private fun schemaIntegerCompare(left: SchemaInteger, right: SchemaInteger): Int {
  if (left.negative != right.negative) return if (left.negative) -1 else 1
  val comparison = schemaIntegerMagnitudeCompare(left.digits, right.digits)
  return if (left.negative) -comparison else comparison
}

private fun schemaIntegerMagnitudeCompare(left: String, right: String): Int {
  if (left.length != right.length) return left.length.compareTo(right.length)
  return left.compareTo(right)
}

private fun schemaIntegerSubtract(left: SchemaInteger, right: SchemaInteger): SchemaInteger = schemaIntegerAdd(left, SchemaInteger(!right.negative && right.digits != "0", right.digits))

private fun schemaIntegerAdd(left: SchemaInteger, right: SchemaInteger): SchemaInteger {
  if (left.negative == right.negative) return SchemaInteger(left.negative, schemaIntegerMagnitudeAdd(left.digits, right.digits))
  val comparison = schemaIntegerMagnitudeCompare(left.digits, right.digits)
  if (comparison == 0) return SchemaInteger(false, "0")
  return if (comparison > 0) {
      SchemaInteger(left.negative, schemaIntegerMagnitudeSubtract(left.digits, right.digits))
  } else {
      SchemaInteger(right.negative, schemaIntegerMagnitudeSubtract(right.digits, left.digits))
  }
}

private fun schemaIntegerMagnitudeAdd(left: String, right: String): String {
  val result = StringBuilder()
  var carry = 0
  val width = maxOf(left.length, right.length)
  for (offset in 0 until width) {
      val leftDigit = left.getOrNull(left.length - 1 - offset)?.minus('0') ?: 0
      val rightDigit = right.getOrNull(right.length - 1 - offset)?.minus('0') ?: 0
      val total = leftDigit + rightDigit + carry
      result.append(('0'.code + total % 10).toChar())
      carry = total / 10
  }
  if (carry > 0) result.append(('0'.code + carry).toChar())
  return result.reverse().toString()
}

private fun schemaIntegerMagnitudeSubtract(left: String, right: String): String {
  val result = StringBuilder()
  var borrow = 0
  for (offset in left.indices) {
      var digit = left[left.length - 1 - offset] - '0' - borrow
      val subtrahend = right.getOrNull(right.length - 1 - offset)?.minus('0') ?: 0
      if (digit < subtrahend) { digit += 10; borrow = 1 } else borrow = 0
      result.append(('0'.code + digit - subtrahend).toChar())
  }
  return result.reverse().toString().trimStart('0').ifEmpty { "0" }
}

private fun schemaExactCompare(left: SchemaDecimal, right: SchemaDecimal): Int {
  if (left.negative != right.negative) return if (left.negative) -1 else 1
  val comparison = schemaExactMagnitudeCompare(left, right)
  return if (left.negative) -comparison else comparison
}

private fun schemaExactMagnitudeCompare(left: SchemaDecimal, right: SchemaDecimal): Int {
  val leftPower = schemaIntegerSubtract(SchemaInteger(false, (left.digits.length - 1).toString()), left.scale)
  val rightPower = schemaIntegerSubtract(SchemaInteger(false, (right.digits.length - 1).toString()), right.scale)
  val powerComparison = schemaIntegerCompare(leftPower, rightPower)
  if (powerComparison != 0) return powerComparison
  val width = maxOf(left.digits.length, right.digits.length)
  for (index in 0 until width) {
      val leftDigit = left.digits.getOrNull(index) ?: '0'
      val rightDigit = right.digits.getOrNull(index) ?: '0'
      if (leftDigit != rightDigit) return leftDigit.compareTo(rightDigit)
  }
  return 0
}

private fun schemaExactIsMultipleOf(`value`: SchemaDecimal, divisor: SchemaDecimal): Boolean {
  if (divisor.digits == "0") return false
  if (value.digits == "0") return true
  val shift = schemaIntegerSubtract(divisor.scale, value.scale)
  if (schemaIntegerCompare(shift, SchemaInteger(false, "0")) < 0) return false
  val divisorTwos = schemaFactorCount(divisor.digits, 2)
  val divisorFives = schemaFactorCount(divisorTwos.first, 5)
  if (schemaExactRemainder(value.digits, divisorFives.first) != "0") return false
  val valueTwos = schemaFactorCount(value.digits, 2).second
  val valueFives = schemaFactorCount(value.digits, 5).second
  val requiredTwos = (divisorTwos.second - valueTwos).coerceAtLeast(0)
  val requiredFives = (divisorFives.second - valueFives).coerceAtLeast(0)
  return schemaIntegerCompare(shift, SchemaInteger(false, requiredTwos.toString())) >= 0 &&
      schemaIntegerCompare(shift, SchemaInteger(false, requiredFives.toString())) >= 0
}

private fun schemaFactorCount(`value`: String, factor: Int): Pair<String, Int> {
  var remainder = value
  var count = 0
  while (remainder != "0") {
      val division = schemaDivideBySmall(remainder, factor)
      if (division.second != 0) break
      remainder = division.first
      count += 1
  }
  return remainder to count
}

private fun schemaDivideBySmall(`value`: String, divisor: Int): Pair<String, Int> {
  val quotient = StringBuilder()
  var remainder = 0
  value.forEach { digit ->
      val combined = remainder * 10 + (digit - '0')
      quotient.append(('0'.code + combined / divisor).toChar())
      remainder = combined % divisor
  }
  return quotient.toString().trimStart('0').ifEmpty { "0" } to remainder
}

private fun schemaExactRemainder(dividend: String, divisor: String): String {
  if (divisor == "1") return "0"
  var remainder = "0"
  dividend.forEach { digit ->
      remainder = (remainder + digit).trimStart('0').ifEmpty { "0" }
      while (schemaIntegerMagnitudeCompare(remainder, divisor) >= 0) {
          remainder = schemaIntegerMagnitudeSubtract(remainder, divisor)
      }
  }
  return remainder
}

private fun JsonElement.isJsonSchemaNumber(): Boolean {
  val primitive = this as? JsonPrimitive ?: return false
  if (primitive.isString || primitive.content == "true" || primitive.content == "false" || this is JsonNull) return false
  return schemaExactDecimal(primitive.content) != null
}

private fun JsonElement.isJsonSchemaInteger(): Boolean {
  val parts = (this as? JsonPrimitive)?.takeIf { isJsonSchemaNumber() }?.let { schemaExactDecimal(it.content) }
      ?: return false
  return schemaIntegerCompare(parts.scale, SchemaInteger(false, "0")) <= 0
}

private fun JsonElement.matchesJsonSchemaNumber(
  minimum: String?,
  maximum: String?,
  exclusiveMinimum: String?,
  exclusiveMaximum: String?,
  multipleOf: String?,
): Boolean {
  if (!isJsonSchemaNumber()) return true
  val value = requireNotNull(schemaExactDecimal((this as JsonPrimitive).content))
  minimum?.let { if (schemaExactCompare(value, requireNotNull(schemaExactDecimal(it))) < 0) return false }
  maximum?.let { if (schemaExactCompare(value, requireNotNull(schemaExactDecimal(it))) > 0) return false }
  exclusiveMinimum?.let { if (schemaExactCompare(value, requireNotNull(schemaExactDecimal(it))) <= 0) return false }
  exclusiveMaximum?.let { if (schemaExactCompare(value, requireNotNull(schemaExactDecimal(it))) >= 0) return false }
  multipleOf?.let { if (!schemaExactIsMultipleOf(value, requireNotNull(schemaExactDecimal(it)))) return false }
  return true
}

private fun JsonElement.matchesJsonSchemaString(
  minLength: Int?,
  maxLength: Int?,
  format: String?,
): Boolean {
  val primitive = this as? JsonPrimitive ?: return true
  if (!primitive.isString) return true
  val value = primitive.content
  val length = value.jsonSchemaCodePointCount()
  if (minLength != null && length < minLength) return false
  if (maxLength != null && length > maxLength) return false
  return when (format) {
      null -> true
      "date" -> value.isRfc3339Date()
      "date-time" -> value.isRfc3339DateTime()
      else -> false
  }
}

private fun JsonElement.jsonSchemaEquals(other: JsonElement): Boolean {
  if (this is JsonNull || other is JsonNull) return this is JsonNull && other is JsonNull
  if (this is JsonArray && other is JsonArray) return size == other.size && indices.all { this[it].jsonSchemaEquals(other[it]) }
  if (this is JsonObject && other is JsonObject) return keys == other.keys && keys.all { key -> getValue(key).jsonSchemaEquals(other.getValue(key)) }
  if (this !is JsonPrimitive || other !is JsonPrimitive) return false
  if (isString || other.isString) return isString && other.isString && content == other.content
  if (isJsonSchemaNumber() && other.isJsonSchemaNumber()) {
      return schemaExactCompare(
          requireNotNull(schemaExactDecimal(content)),
          requireNotNull(schemaExactDecimal(other.content)),
      ) == 0
  }
  return content == other.content
}

private fun String.jsonSchemaCodePointCount(): Int {
  var count = 0
  var index = 0
  while (index < length) {
      val highSurrogate = this[index].code in 55296..56319
      val lowSurrogate = index + 1 < length && this[index + 1].code in 56320..57343
      index += if (highSurrogate && lowSurrogate) 2 else 1
      count += 1
  }
  return count
}

private fun String.isRfc3339Date(): Boolean {
  val match = Regex("^(\\d{4})-(\\d{2})-(\\d{2})$").matchEntire(this) ?: return false
  return isValidRfc3339Date(match.groupValues[1].toInt(), match.groupValues[2].toInt(), match.groupValues[3].toInt())
}

private fun String.isRfc3339DateTime(): Boolean {
  val match = Regex("^(\\d{4})-(\\d{2})-(\\d{2})[Tt](\\d{2}):(\\d{2}):(\\d{2})(?:\\.\\d+)?([Zz]|[+-]\\d{2}:\\d{2})$")
      .matchEntire(this) ?: return false
  val hour = match.groupValues[4].toInt()
  val minute = match.groupValues[5].toInt()
  val second = match.groupValues[6].toInt()
  val offset = match.groupValues[7]
  val year = match.groupValues[1].toInt()
  val month = match.groupValues[2].toInt()
  val day = match.groupValues[3].toInt()
  if (!isValidRfc3339Date(year, month, day)) return false
  if (hour !in 0..23 || minute !in 0..59 || second !in 0..60) return false
  if (offset.length != 1) {
      val offsetHour = offset.substring(1, 3).toInt()
      val offsetMinute = offset.substring(4, 6).toInt()
      if (offsetHour !in 0..23 || offsetMinute !in 0..59) return false
  }
  return second != 60 || isKnownRfc3339LeapSecond(year, month, day, hour, minute, offset)
}

private fun isValidRfc3339Date(
  year: Int,
  month: Int,
  day: Int,
): Boolean {
  if (month !in 1..12) return false
  val days = when (month) {
      2 -> if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) 29 else 28
      4, 6, 9, 11 -> 30
      else -> 31
  }
  return day in 1..days
}

private fun isKnownRfc3339LeapSecond(
  year: Int,
  month: Int,
  day: Int,
  hour: Int,
  minute: Int,
  offset: String,
): Boolean {
  val offsetMinutes =
      if (offset.length == 1) 0
      else {
          val value = offset.substring(1, 3).toInt() * 60 + offset.substring(4, 6).toInt()
          if (offset[0] == '-') -value else value
      }
  val instant = rfc3339DayIndex(year, month, day) * 1_440L + hour * 60L + minute + 1L - offsetMinutes
  return rfc3339LeapSecondInstants().contains(instant)
}

private fun rfc3339DayIndex(
  year: Int,
  month: Int,
  day: Int,
): Long {
  val yearDays = 365L * year + (year + 3L) / 4L - (year + 99L) / 100L + (year + 399L) / 400L
  val monthDays = intArrayOf(0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334)[month - 1]
  val leapDay = if (month > 2 && year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) 1 else 0
  return yearDays + monthDays + leapDay + day - 1L
}

private fun rfc3339LeapSecondInstants(): Set<Long> = setOf(
    (rfc3339DayIndex(1972, 6, 30) + 1L) * 1_440L, (rfc3339DayIndex(1972, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(1973, 12, 31) + 1L) * 1_440L, (rfc3339DayIndex(1974, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(1975, 12, 31) + 1L) * 1_440L, (rfc3339DayIndex(1976, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(1977, 12, 31) + 1L) * 1_440L, (rfc3339DayIndex(1978, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(1979, 12, 31) + 1L) * 1_440L, (rfc3339DayIndex(1981, 6, 30) + 1L) * 1_440L,
    (rfc3339DayIndex(1982, 6, 30) + 1L) * 1_440L, (rfc3339DayIndex(1983, 6, 30) + 1L) * 1_440L,
    (rfc3339DayIndex(1985, 6, 30) + 1L) * 1_440L, (rfc3339DayIndex(1987, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(1989, 12, 31) + 1L) * 1_440L, (rfc3339DayIndex(1990, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(1992, 6, 30) + 1L) * 1_440L, (rfc3339DayIndex(1993, 6, 30) + 1L) * 1_440L,
    (rfc3339DayIndex(1994, 6, 30) + 1L) * 1_440L, (rfc3339DayIndex(1995, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(1997, 6, 30) + 1L) * 1_440L, (rfc3339DayIndex(1998, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(2005, 12, 31) + 1L) * 1_440L, (rfc3339DayIndex(2008, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(2012, 6, 30) + 1L) * 1_440L, (rfc3339DayIndex(2015, 6, 30) + 1L) * 1_440L,
    (rfc3339DayIndex(2016, 12, 31) + 1L) * 1_440L,
)

private fun schemaDecimalParts(`value`: String): List<String>? {
  val match = Regex("^(-?)(0|[1-9]\\d*)(?:\\.(\\d+))?(?:[eE]([+-]?\\d+))?$").matchEntire(value) ?: return null
  val exponent = match.groupValues[4].ifEmpty { "0" }.toLongOrNull() ?: return null
  var digits = (match.groupValues[2] + match.groupValues[3]).trimStart('0').ifEmpty { "0" }
  var scale = match.groupValues[3].length.toLong() - exponent
  while (digits.length > 1 && digits.endsWith('0')) {
      digits = digits.dropLast(1)
      scale -= 1L
  }
  return listOf(if (digits == "0") "" else match.groupValues[1], digits, scale.toString())
}

private fun schemaCompare(left: List<String>, right: List<String>): Int {
  val leftNegative = left[0] == "-"
  val rightNegative = right[0] == "-"
  if (leftNegative != rightNegative) return if (leftNegative) -1 else 1
  val comparison = schemaCompareMagnitude(left, right)
  return if (leftNegative) -comparison else comparison
}

private fun schemaCompareMagnitude(left: List<String>, right: List<String>): Int {
  val leftScale = left[2].toLong()
  val rightScale = right[2].toLong()
  val leftPower = left[1].length.toLong() - 1L - leftScale
  val rightPower = right[1].length.toLong() - 1L - rightScale
  if (leftPower != rightPower) return leftPower.compareTo(rightPower)
  val width = maxOf(left[1].length, right[1].length)
  for (index in 0 until width) {
      val leftDigit = left[1].getOrNull(index) ?: '0'
      val rightDigit = right[1].getOrNull(index) ?: '0'
      if (leftDigit != rightDigit) return leftDigit.compareTo(rightDigit)
  }
  return 0
}

private fun schemaIsMultipleOf(`value`: List<String>, divisor: List<String>): Boolean {
  if (divisor[1] == "0") return false
  if (value[1] == "0") return true
  val shift = divisor[2].toLong() - value[2].toLong()
  return if (shift >= 0L) {
      schemaRemainderAfterZeros(value[1], divisor[1], shift) == "0"
  } else {
      val zeros = -shift
      if (zeros > value[1].length.toLong()) false
      else {
          val count = zeros.toInt()
          value[1].takeLast(count).all { it == '0' } && schemaRemainder(value[1].dropLast(count), divisor[1]) == "0"
      }
  }
}

private fun schemaRemainderAfterZeros(
  dividend: String,
  divisor: String,
  zeros: Long,
): String {
  var remainder = schemaRemainder(dividend, divisor)
  var remaining = zeros
  while (remaining > 0L) {
      remainder = schemaRemainder(remainder + "0", divisor)
      remaining -= 1L
  }
  return remainder
}

private fun schemaRemainder(dividend: String, divisor: String): String {
  var remainder = "0"
  dividend.forEach { digit ->
      remainder = (remainder + digit).trimStart('0').ifEmpty { "0" }
      while (schemaCompareInteger(remainder, divisor) >= 0) remainder = schemaSubtractInteger(remainder, divisor)
  }
  return remainder
}

private fun schemaCompareInteger(left: String, right: String): Int {
  if (left.length != right.length) return left.length.compareTo(right.length)
  return left.compareTo(right)
}

private fun schemaSubtractInteger(left: String, right: String): String {
  val result = StringBuilder()
  var borrow = 0
  for (index in left.indices.reversed()) {
      var digit = (left[index] - '0') - borrow
      val subtrahend = right.getOrNull(right.length - (left.length - index))?.minus('0') ?: 0
      if (digit < subtrahend) { digit += 10; borrow = 1 } else borrow = 0
      result.append(('0'.code + digit - subtrahend).toChar())
  }
  return result.reverse().toString().trimStart('0').ifEmpty { "0" }
}

private fun JsonObject.stringValue(name: String): String? {
  val primitive = this[name] as? JsonPrimitive ?: return null
  return primitive.takeIf { it.isString }?.content
}
