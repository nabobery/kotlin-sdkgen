package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Repository Identifier
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/code-scanning-variant-analysis-repository
 */
@Serializable(with = CodeScanningVariantAnalysisRepository.Serializer::class)
public class CodeScanningVariantAnalysisRepository(
  /**
   * The full, globally unique, name of the repository.
   */
  public val fullName: String,
  /**
   * A unique identifier of the repository.
   */
  public val id: Int,
  /**
   * The name of the repository.
   */
  public val name: String,
  /**
   * Whether the repository is private.
   */
  public val `private`: Boolean,
  public val stargazersCount: Int,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val updatedAt: String?,
) {
  public class Builder {
    private var fullNameValue: String? = null

    public var fullName: String
      get() = requireNotNull(fullNameValue) { "fullName is required" }
      set(`value`) {
        fullNameValue = value
      }

    private var idValue: Int? = null

    public var id: Int
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var privateValue: Boolean? = null

    public var `private`: Boolean
      get() = requireNotNull(privateValue) { "private is required" }
      set(`value`) {
        privateValue = value
      }

    private var stargazersCountValue: Int? = null

    public var stargazersCount: Int
      get() = requireNotNull(stargazersCountValue) { "stargazersCount is required" }
      set(`value`) {
        stargazersCountValue = value
      }

    private var updatedAtState: FieldState<String?> = FieldState.Absent

    /**
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     * Required nullable field; assigning `null` records present-null.
     */
    public var updatedAt: String?
      get() = updatedAtState.valueOrNull()
      set(`value`) {
        updatedAtState = value.toNullableFieldState()
      }

    public fun build(): CodeScanningVariantAnalysisRepository {
      check(fullNameValue != null) { "fullName is required" }
      check(idValue != null) { "id is required" }
      check(nameValue != null) { "name is required" }
      check(privateValue != null) { "private is required" }
      check(stargazersCountValue != null) { "stargazersCount is required" }
      check(updatedAtState !== FieldState.Absent) { "updatedAt is required, even when null" }
      return CodeScanningVariantAnalysisRepository(
        fullName = fullName,
        id = id,
        name = name,
        private = private,
        stargazersCount = stargazersCount,
        updatedAt = updatedAtState.valueOrNull(),
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CodeScanningVariantAnalysisRepository = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<CodeScanningVariantAnalysisRepository> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CodeScanningVariantAnalysisRepository {
      val jsonDecoder = decoder.requireJsonDecoder("CodeScanningVariantAnalysisRepository")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CodeScanningVariantAnalysisRepository must be a JSON object")
      val fullName = json.decodeRequired<String>(rawObject, "full_name")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val name = json.decodeRequired<String>(rawObject, "name")
      val private = json.decodeRequired<Boolean>(rawObject, "private")
      val stargazersCount = json.decodeRequired<Int>(rawObject, "stargazers_count")
      if (!rawObject.containsKey("updated_at")) {
        throw SerializationException("CodeScanningVariantAnalysisRepository is missing required property 'updated_at'")
      }
      val updatedAt = rawObject["updated_at"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return CodeScanningVariantAnalysisRepository(
        fullName = fullName,
        id = id,
        name = name,
        private = private,
        stargazersCount = stargazersCount,
        updatedAt = updatedAt,
      )
    }

    override fun serialize(encoder: Encoder, `value`: CodeScanningVariantAnalysisRepository) {
      val jsonEncoder = encoder.requireJsonEncoder("CodeScanningVariantAnalysisRepository")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("full_name", value.fullName)
        put("id", json.encodeToJsonElement(value.id))
        put("name", value.name)
        put("private", json.encodeToJsonElement(value.private))
        put("stargazers_count", json.encodeToJsonElement(value.stargazersCount))
        put("updated_at", value.updatedAt?.let { json.encodeToJsonElement(it) } ?: JsonNull)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun codeScanningVariantAnalysisRepository(block: CodeScanningVariantAnalysisRepository.Builder.() -> Unit): CodeScanningVariantAnalysisRepository = CodeScanningVariantAnalysisRepository.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CodeScanningVariantAnalysisRepository is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("CodeScanningVariantAnalysisRepository property '" + name + "' is not nullable")
    return FieldState.Null
  }
  return FieldState.Value(decodeFromJsonElement<T>(element))
}

private inline fun <T> JsonObjectBuilder.putState(
  name: String,
  state: FieldState<T>,
  encode: (T) -> JsonElement,
) {
  when (state) {
    FieldState.Absent -> Unit
    FieldState.Null -> put(name, JsonNull)
    is FieldState.Value -> put(name, encode(state.value))
  }
}
