package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Int
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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * A custom pattern for secret scanning.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/secret-scanning-custom-pattern
 */
@Serializable(with = SecretScanningCustomPattern.Serializer::class)
public class SecretScanningCustomPattern(
  /**
   * The ID of the custom pattern.
   */
  public val id: Int,
  /**
   * The name of the custom pattern.
   */
  public val name: String,
  /**
   * The regular expression of the custom pattern.
   */
  public val pattern: String,
  /**
   * Whether push protection is enabled for this custom pattern.
   */
  public val pushProtectionEnabled: Boolean,
  /**
   * A URL-friendly identifier for the custom pattern, derived from its name.
   */
  public val slug: String,
  /**
   * The state of the custom pattern.
   */
  public val state: InlineSecretScanningCustomPatternStateX8c916cd0,
  /**
   * The date and time the custom pattern was created in ISO 8601 format.
   */
  public val createdAt: String? = null,
  public val customPatternVersion: String? = null,
  /**
   * The end delimiter regex for the custom pattern.
   */
  public val endDelimiter: String? = null,
  /**
   * List of regexes that the secret must match.
   */
  public val mustMatch: List<String>? = null,
  /**
   * List of regexes that the secret must not match.
   */
  public val mustNotMatch: List<String>? = null,
  /**
   * The start delimiter regex for the custom pattern.
   */
  public val startDelimiter: String? = null,
  /**
   * The date and time the custom pattern was last updated in ISO 8601 format.
   */
  public val updatedAt: String? = null,
) {
  public class Builder {
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

    private var patternValue: String? = null

    public var pattern: String
      get() = requireNotNull(patternValue) { "pattern is required" }
      set(`value`) {
        patternValue = value
      }

    private var pushProtectionEnabledValue: Boolean? = null

    public var pushProtectionEnabled: Boolean
      get() = requireNotNull(pushProtectionEnabledValue) { "pushProtectionEnabled is required" }
      set(`value`) {
        pushProtectionEnabledValue = value
      }

    private var slugValue: String? = null

    public var slug: String
      get() = requireNotNull(slugValue) { "slug is required" }
      set(`value`) {
        slugValue = value
      }

    private var stateValue: InlineSecretScanningCustomPatternStateX8c916cd0? = null

    public var state: InlineSecretScanningCustomPatternStateX8c916cd0
      get() = requireNotNull(stateValue) { "state is required" }
      set(`value`) {
        stateValue = value
      }

    /**
     * The date and time the custom pattern was created in ISO 8601 format.
     */
    public var createdAt: String? = null

    public var customPatternVersion: String? = null

    /**
     * The end delimiter regex for the custom pattern.
     */
    public var endDelimiter: String? = null

    /**
     * List of regexes that the secret must match.
     */
    public var mustMatch: List<String>? = null

    /**
     * List of regexes that the secret must not match.
     */
    public var mustNotMatch: List<String>? = null

    /**
     * The start delimiter regex for the custom pattern.
     */
    public var startDelimiter: String? = null

    /**
     * The date and time the custom pattern was last updated in ISO 8601 format.
     */
    public var updatedAt: String? = null

    public fun build(): SecretScanningCustomPattern {
      check(idValue != null) { "id is required" }
      check(nameValue != null) { "name is required" }
      check(patternValue != null) { "pattern is required" }
      check(pushProtectionEnabledValue != null) { "pushProtectionEnabled is required" }
      check(slugValue != null) { "slug is required" }
      check(stateValue != null) { "state is required" }
      return SecretScanningCustomPattern(
        id = id,
        name = name,
        pattern = pattern,
        pushProtectionEnabled = pushProtectionEnabled,
        slug = slug,
        state = state,
        createdAt = createdAt,
        customPatternVersion = customPatternVersion,
        endDelimiter = endDelimiter,
        mustMatch = mustMatch,
        mustNotMatch = mustNotMatch,
        startDelimiter = startDelimiter,
        updatedAt = updatedAt,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SecretScanningCustomPattern = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<SecretScanningCustomPattern> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SecretScanningCustomPattern {
      val jsonDecoder = decoder.requireJsonDecoder("SecretScanningCustomPattern")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SecretScanningCustomPattern must be a JSON object")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val name = json.decodeRequired<String>(rawObject, "name")
      val pattern = json.decodeRequired<String>(rawObject, "pattern")
      val pushProtectionEnabled = json.decodeRequired<Boolean>(rawObject, "push_protection_enabled")
      val slug = json.decodeRequired<String>(rawObject, "slug")
      val state = json.decodeRequired<InlineSecretScanningCustomPatternStateX8c916cd0>(rawObject, "state")
      return SecretScanningCustomPattern(
        id = id,
        name = name,
        pattern = pattern,
        pushProtectionEnabled = pushProtectionEnabled,
        slug = slug,
        state = state,
        createdAt = rawObject["created_at"]?.let { json.decodeFromJsonElement<String>(it) },
        customPatternVersion = rawObject["custom_pattern_version"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        endDelimiter = rawObject["end_delimiter"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        mustMatch = rawObject["must_match"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<String>?>(element) },
        mustNotMatch = rawObject["must_not_match"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<String>?>(element) },
        startDelimiter = rawObject["start_delimiter"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        updatedAt = rawObject["updated_at"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SecretScanningCustomPattern) {
      val jsonEncoder = encoder.requireJsonEncoder("SecretScanningCustomPattern")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("id", json.encodeToJsonElement(value.id))
        put("name", value.name)
        put("pattern", value.pattern)
        put("push_protection_enabled", json.encodeToJsonElement(value.pushProtectionEnabled))
        put("slug", value.slug)
        put("state", json.encodeToJsonElement(value.state))
        value.createdAt?.let { put("created_at", it) }
        value.customPatternVersion?.let { put("custom_pattern_version", it) }
        value.endDelimiter?.let { put("end_delimiter", it) }
        value.mustMatch?.let { put("must_match", json.encodeToJsonElement(it)) }
        value.mustNotMatch?.let { put("must_not_match", json.encodeToJsonElement(it)) }
        value.startDelimiter?.let { put("start_delimiter", it) }
        value.updatedAt?.let { put("updated_at", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun secretScanningCustomPattern(block: SecretScanningCustomPattern.Builder.() -> Unit): SecretScanningCustomPattern = SecretScanningCustomPattern.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("SecretScanningCustomPattern is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
