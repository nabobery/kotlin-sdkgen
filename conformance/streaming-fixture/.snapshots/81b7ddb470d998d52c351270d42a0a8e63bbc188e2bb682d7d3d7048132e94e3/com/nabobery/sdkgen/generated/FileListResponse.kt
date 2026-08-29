package com.nabobery.sdkgen.generated

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

public sealed class FileListResponseDecodingException(
  message: String,
) : SerializationException(message)

public class FileListResponseNoMatchException(
  message: String,
) : FileListResponseDecodingException(message)

public class FileListResponseAmbiguityException(
  message: String,
) : FileListResponseDecodingException(message)

public class FileListResponseBranchValidationException(
  message: String,
) : FileListResponseDecodingException(message)

/**
 * Closed oneOf union for sdkgen://source/openapi.yaml#/components/schemas/FileListResponse.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/FileListResponse
 */
@Serializable(with = FileListResponseSerializer::class)
public sealed interface FileListResponse {
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonObject

  public class OpenRouterFileList internal constructor(
    public val shape: InlineOpenRouterFileListShapeX1640caf6,
    public val cursor: String?,
    `data`: List<FileEntry>,
    public val firstId: String?,
    public val hasMore: Boolean,
    public val lastId: String?,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : FileListResponse {
    public val `data`: List<FileEntry> = data.toList()

    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        shape: InlineOpenRouterFileListShapeX1640caf6,
        cursor: String?,
        `data`: List<FileEntry>,
        firstId: String?,
        hasMore: Boolean,
        lastId: String?,
      ): OpenRouterFileList {
        val dataOwnershipSnapshot = data.toList()
        val raw = buildJsonObject {
          put("_shape", SdkJson.encodeToJsonElement(shape))
          put("cursor", cursor)
          put("data", SdkJson.encodeToJsonElement(dataOwnershipSnapshot))
          put("first_id", firstId)
          put("has_more", SdkJson.encodeToJsonElement(hasMore))
          put("last_id", lastId)
        }
        val inspection = inspectFileListResponse(raw)
        if (inspection.size == 0) {
          throw FileListResponseNoMatchException("FileListResponse matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.openRouterFileListMatches) {
          throw FileListResponseBranchValidationException("OpenRouterFileList factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw FileListResponseAmbiguityException("FileListResponse matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return OpenRouterFileList(
          shape = shape,
          cursor = cursor,
          data = dataOwnershipSnapshot,
          firstId = firstId,
          hasMore = hasMore,
          lastId = lastId,
          raw = raw,
        )
      }
    }
  }

  public class OpenAiFileList internal constructor(
    public val shape: InlineOpenAiFileListShapeX12980995,
    `data`: List<FileEntry>,
    public val hasMore: Boolean,
    public val objectValue: InlineOpenAiFileListObjectValueX1f865375,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : FileListResponse {
    public val `data`: List<FileEntry> = data.toList()

    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        shape: InlineOpenAiFileListShapeX12980995,
        `data`: List<FileEntry>,
        hasMore: Boolean,
        objectValue: InlineOpenAiFileListObjectValueX1f865375,
      ): OpenAiFileList {
        val dataOwnershipSnapshot = data.toList()
        val raw = buildJsonObject {
          put("_shape", SdkJson.encodeToJsonElement(shape))
          put("data", SdkJson.encodeToJsonElement(dataOwnershipSnapshot))
          put("has_more", SdkJson.encodeToJsonElement(hasMore))
          put("object", SdkJson.encodeToJsonElement(objectValue))
        }
        val inspection = inspectFileListResponse(raw)
        if (inspection.size == 0) {
          throw FileListResponseNoMatchException("FileListResponse matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.openAiFileListMatches) {
          throw FileListResponseBranchValidationException("OpenAiFileList factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw FileListResponseAmbiguityException("FileListResponse matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return OpenAiFileList(
          shape = shape,
          data = dataOwnershipSnapshot,
          hasMore = hasMore,
          objectValue = objectValue,
          raw = raw,
        )
      }
    }
  }
}

internal object FileListResponseSerializer : KSerializer<FileListResponse> {
  override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

  override fun deserialize(decoder: Decoder): FileListResponse {
    val jsonDecoder = decoder.requireJsonDecoder("FileListResponse")
    val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw FileListResponseNoMatchException("FileListResponse matched 0 branches: expected JSON object")
    val matches = inspectFileListResponse(rawObject)
    if (matches.size == 0) {
      throw FileListResponseNoMatchException("FileListResponse matched 0 branches: " + matches.failures.joinToString("; "))
    }
    if (matches.size > 1) {
      throw FileListResponseAmbiguityException("FileListResponse matched " + matches.size + " branches; expected exactly 1: " + matches.names.joinToString())
    }
    return when {
      matches.openRouterFileListMatches -> FileListResponse.OpenRouterFileList(shape = requireNotNull(matches.shapeState3), cursor = matches.cursor, data = requireNotNull(matches.data), firstId = matches.firstId, hasMore = requireNotNull(matches.hasMore), lastId = matches.lastId, raw = rawObject)
      matches.openAiFileListMatches -> FileListResponse.OpenAiFileList(shape = requireNotNull(matches.shapeState1), data = requireNotNull(matches.data), hasMore = requireNotNull(matches.hasMore), objectValue = requireNotNull(matches.objectValue), raw = rawObject)
      else -> error("unreachable")
    }
  }

  override fun serialize(encoder: Encoder, `value`: FileListResponse) {
    encoder.requireJsonEncoder("FileListResponse").encodeJsonElement(value.raw)
  }
}

internal data class FileListResponseInspection(
  public val shapeState3: InlineOpenRouterFileListShapeX1640caf6?,
  public val shapeState3Decoded: Boolean,
  public val shapeState3Matches: Boolean,
  public val shapeState4: InlineOpenRouterFileListShapeX1640caf6?,
  public val shapeState4Decoded: Boolean,
  public val shapeState4Matches: Boolean,
  public val cursor: String?,
  public val cursorPresent: Boolean,
  public val cursorDecoded: Boolean,
  public val `data`: List<FileEntry>?,
  public val dataDecoded: Boolean,
  public val firstId: String?,
  public val firstIdPresent: Boolean,
  public val firstIdDecoded: Boolean,
  public val hasMore: Boolean?,
  public val hasMoreDecoded: Boolean,
  public val lastId: String?,
  public val lastIdPresent: Boolean,
  public val lastIdDecoded: Boolean,
  public val shapeState1: InlineOpenAiFileListShapeX12980995?,
  public val shapeState1Decoded: Boolean,
  public val shapeState1Matches: Boolean,
  public val shapeState2: InlineOpenAiFileListShapeX12980995?,
  public val shapeState2Decoded: Boolean,
  public val shapeState2Matches: Boolean,
  public val objectValue: InlineOpenAiFileListObjectValueX1f865375?,
  public val objectValueDecoded: Boolean,
  public val objectValueMatches: Boolean,
  public val openRouterFileListMatches: Boolean,
  public val openAiFileListMatches: Boolean,
  public val rawEmpty: Boolean,
  public val failures: List<String>,
) {
  public val names: List<String>
    get() = buildList {
      if (openRouterFileListMatches) add("OpenRouterFileList")
      if (openAiFileListMatches) add("OpenAiFileList")
    }

  public val size: Int
    get() = names.size
}

private fun inspectFileListResponse(rawObject: JsonObject): FileListResponseInspection {
  val shapeState3Result = rawObject["_shape"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOpenRouterFileListShapeX1640caf6>(element) } }
  val shapeState3 = shapeState3Result?.getOrNull()
  val shapeState3Decoded = shapeState3Result?.isSuccess == true
  val shapeState3Matches = (rawObject.stringValue("_shape") == "openrouter") && shapeState3Decoded
  val shapeState4Result = rawObject["_shape"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOpenRouterFileListShapeX1640caf6>(element) } }
  val shapeState4 = shapeState4Result?.getOrNull()
  val shapeState4Decoded = shapeState4Result?.isSuccess == true
  val shapeState4Matches = (rawObject.stringValue("_shape") == "openrouter") && shapeState4Decoded
  val cursorResult = rawObject["cursor"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String?>(element) } }
  val cursor = cursorResult?.getOrNull()
  val cursorPresent = rawObject.containsKey("cursor")
  val cursorDecoded = cursorResult?.isSuccess == true
  val dataResult = rawObject["data"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<List<FileEntry>>(element) } }
  val data = dataResult?.getOrNull()
  val dataDecoded = dataResult?.isSuccess == true
  val firstIdResult = rawObject["first_id"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String?>(element) } }
  val firstId = firstIdResult?.getOrNull()
  val firstIdPresent = rawObject.containsKey("first_id")
  val firstIdDecoded = firstIdResult?.isSuccess == true
  val hasMoreResult = rawObject["has_more"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<Boolean>(element) } }
  val hasMore = hasMoreResult?.getOrNull()
  val hasMoreDecoded = hasMoreResult?.isSuccess == true
  val lastIdResult = rawObject["last_id"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String?>(element) } }
  val lastId = lastIdResult?.getOrNull()
  val lastIdPresent = rawObject.containsKey("last_id")
  val lastIdDecoded = lastIdResult?.isSuccess == true
  val shapeState1Result = rawObject["_shape"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOpenAiFileListShapeX12980995>(element) } }
  val shapeState1 = shapeState1Result?.getOrNull()
  val shapeState1Decoded = shapeState1Result?.isSuccess == true
  val shapeState1Matches = (rawObject.stringValue("_shape") == "openai") && shapeState1Decoded
  val shapeState2Result = rawObject["_shape"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOpenAiFileListShapeX12980995>(element) } }
  val shapeState2 = shapeState2Result?.getOrNull()
  val shapeState2Decoded = shapeState2Result?.isSuccess == true
  val shapeState2Matches = (rawObject.stringValue("_shape") == "openai") && shapeState2Decoded
  val objectValueResult = rawObject["object"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOpenAiFileListObjectValueX1f865375>(element) } }
  val objectValue = objectValueResult?.getOrNull()
  val objectValueDecoded = objectValueResult?.isSuccess == true
  val objectValueMatches = (rawObject.stringValue("object") == "list") && objectValueDecoded
  val rawEmpty = rawObject.isEmpty()
  val openRouterFileListMatches = matchesFileListResponseOpenRouterFileListBranch(rawObject) && (shapeState3Matches)
  val openAiFileListMatches = matchesFileListResponseOpenAiFileListBranch(rawObject) && (shapeState1Matches)
  return FileListResponseInspection(
    shapeState3 = shapeState3,
    shapeState3Decoded = shapeState3Decoded,
    shapeState3Matches = shapeState3Matches,
    shapeState4 = shapeState4,
    shapeState4Decoded = shapeState4Decoded,
    shapeState4Matches = shapeState4Matches,
    cursor = cursor,
    cursorPresent = cursorPresent,
    cursorDecoded = cursorDecoded,
    data = data,
    dataDecoded = dataDecoded,
    firstId = firstId,
    firstIdPresent = firstIdPresent,
    firstIdDecoded = firstIdDecoded,
    hasMore = hasMore,
    hasMoreDecoded = hasMoreDecoded,
    lastId = lastId,
    lastIdPresent = lastIdPresent,
    lastIdDecoded = lastIdDecoded,
    shapeState1 = shapeState1,
    shapeState1Decoded = shapeState1Decoded,
    shapeState1Matches = shapeState1Matches,
    shapeState2 = shapeState2,
    shapeState2Decoded = shapeState2Decoded,
    shapeState2Matches = shapeState2Matches,
    objectValue = objectValue,
    objectValueDecoded = objectValueDecoded,
    objectValueMatches = objectValueMatches,
    openRouterFileListMatches = openRouterFileListMatches,
    openAiFileListMatches = openAiFileListMatches,
    rawEmpty = rawEmpty,
    failures = buildList {
      if (!openRouterFileListMatches) add("OpenRouterFileList: branch predicate did not match properties '_shape'")
      if (!openAiFileListMatches) add("OpenAiFileList: branch predicate did not match properties '_shape'")
    },
  )
}

private fun matchesFileListResponseOpenRouterFileListBranch(rawObject: JsonObject): Boolean = ((rawObject.containsKey("_shape") && rawObject.containsKey("cursor") && rawObject.containsKey("data") && rawObject.containsKey("first_id") && rawObject.containsKey("has_more") && rawObject.containsKey("last_id") && (rawObject["_shape"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"openrouter\"")))) } ?: true) && (rawObject["cursor"]?.let { property -> (property is JsonPrimitive && property.isString || property is JsonNull) } ?: true) && (rawObject["data"]?.let { property -> (property is JsonArray && (property.all { item -> (item is JsonObject && (item.containsKey("filename") && item.containsKey("id") && (item["filename"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && (item["id"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && item.keys.all { it in setOf("filename", "id") })) })) } ?: true) && (rawObject["first_id"]?.let { property -> (property is JsonPrimitive && property.isString || property is JsonNull) } ?: true) && (rawObject["has_more"]?.let { property -> property is JsonPrimitive && (property.content == "true" || property.content == "false") } ?: true) && (rawObject["last_id"]?.let { property -> (property is JsonPrimitive && property.isString || property is JsonNull) } ?: true) && rawObject.keys.all { it in setOf("_shape", "cursor", "data", "first_id", "has_more", "last_id") }))

private fun matchesFileListResponseOpenAiFileListBranch(rawObject: JsonObject): Boolean = ((rawObject.containsKey("_shape") && rawObject.containsKey("data") && rawObject.containsKey("has_more") && rawObject.containsKey("object") && (rawObject["_shape"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"openai\"")))) } ?: true) && (rawObject["data"]?.let { property -> (property is JsonArray && (property.all { item -> (item is JsonObject && (item.containsKey("filename") && item.containsKey("id") && (item["filename"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && (item["id"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && item.keys.all { it in setOf("filename", "id") })) })) } ?: true) && (rawObject["has_more"]?.let { property -> property is JsonPrimitive && (property.content == "true" || property.content == "false") } ?: true) && (rawObject["object"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"list\"")))) } ?: true) && rawObject.keys.all { it in setOf("_shape", "data", "has_more", "object") }))

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
