package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * A custom pattern to create in a bulk operation.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/secret-scanning-custom-pattern-to-create
 */
@Serializable(with = SecretScanningCustomPatternToCreate.Serializer::class)
public class SecretScanningCustomPatternToCreate(
  /**
   * The name of the custom pattern.
   */
  public val name: String,
  /**
   * The regular expression of the custom pattern.
   */
  public val pattern: String,
  /**
   * The end delimiter regex for the custom pattern.
   * Defaults to `\z|[^0-9A-Za-z]` when not specified.
   */
  public val endDelimiter: String? = null,
  mustMatch: List<String>? = null,
  mustNotMatch: List<String>? = null,
  /**
   * The start delimiter regex for the custom pattern.
   * Defaults to `\A|[^0-9A-Za-z]` when not specified.
   */
  public val startDelimiter: String? = null,
) {
  /**
   * List of regexes that the secret must match.
   */
  public val mustMatch: List<String>? = mustMatch?.let { collection0 -> collection0.toList() }

  /**
   * List of regexes that the secret must not match.
   */
  public val mustNotMatch: List<String>? = mustNotMatch?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var patternValue: String? = null

    public var pattern: String
      get() = requireNotNull(patternValue) { "pattern is required" }
      set(`value`) {
        patternValue = value
      }

    /**
     * The end delimiter regex for the custom pattern.
     * Defaults to `\z|[^0-9A-Za-z]` when not specified.
     */
    public var endDelimiter: String? = null

    private var mustMatchValue: List<String>? = null

    /**
     * List of regexes that the secret must match.
     */
    public var mustMatch: List<String>?
      get() = mustMatchValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        mustMatchValue = value?.let { collection0 -> collection0.toList() }
      }

    private var mustNotMatchValue: List<String>? = null

    /**
     * List of regexes that the secret must not match.
     */
    public var mustNotMatch: List<String>?
      get() = mustNotMatchValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        mustNotMatchValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * The start delimiter regex for the custom pattern.
     * Defaults to `\A|[^0-9A-Za-z]` when not specified.
     */
    public var startDelimiter: String? = null

    public fun build(): SecretScanningCustomPatternToCreate {
      check(nameValue != null) { "name is required" }
      check(patternValue != null) { "pattern is required" }
      return SecretScanningCustomPatternToCreate(
        name = name,
        pattern = pattern,
        endDelimiter = endDelimiter,
        mustMatch = mustMatch,
        mustNotMatch = mustNotMatch,
        startDelimiter = startDelimiter,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SecretScanningCustomPatternToCreate = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<SecretScanningCustomPatternToCreate> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SecretScanningCustomPatternToCreate {
      val jsonDecoder = decoder.requireJsonDecoder("SecretScanningCustomPatternToCreate")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SecretScanningCustomPatternToCreate must be a JSON object")
      val name = json.decodeRequired<String>(rawObject, "name")
      val pattern = json.decodeRequired<String>(rawObject, "pattern")
      return SecretScanningCustomPatternToCreate(
        name = name,
        pattern = pattern,
        endDelimiter = rawObject["end_delimiter"]?.let { json.decodeFromJsonElement<String>(it) },
        mustMatch = rawObject["must_match"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        mustNotMatch = rawObject["must_not_match"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        startDelimiter = rawObject["start_delimiter"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SecretScanningCustomPatternToCreate) {
      val jsonEncoder = encoder.requireJsonEncoder("SecretScanningCustomPatternToCreate")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("name", value.name)
        put("pattern", value.pattern)
        value.endDelimiter?.let { put("end_delimiter", it) }
        value.mustMatch?.let { put("must_match", json.encodeToJsonElement(it)) }
        value.mustNotMatch?.let { put("must_not_match", json.encodeToJsonElement(it)) }
        value.startDelimiter?.let { put("start_delimiter", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun secretScanningCustomPatternToCreate(block: SecretScanningCustomPatternToCreate.Builder.() -> Unit): SecretScanningCustomPatternToCreate = SecretScanningCustomPatternToCreate.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("SecretScanningCustomPatternToCreate is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
