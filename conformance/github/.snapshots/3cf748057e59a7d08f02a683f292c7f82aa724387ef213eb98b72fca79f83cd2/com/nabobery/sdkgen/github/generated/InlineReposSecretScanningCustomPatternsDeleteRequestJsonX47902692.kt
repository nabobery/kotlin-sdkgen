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
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1secret-scanning~1custom-patterns/delete/requestBody/con
 * tent/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1secret-scanning~1custom-patterns/delete/requestBody/con
 * tent/application~1json/schema
 */
@Serializable(with = InlineReposSecretScanningCustomPatternsDeleteRequestJsonX47902692.Serializer::class)
public class InlineReposSecretScanningCustomPatternsDeleteRequestJsonX47902692(
  patterns: List<SecretScanningCustomPatternToDelete>,
  /**
   * What to do with alerts associated with the deleted patterns.
   * `delete_alerts` permanently removes the alerts.
   * `resolve_alerts` resolves the alerts as "pattern deleted".
   * Defaults to `delete_alerts` when not specified.
   */
  public val postDeleteAction:
      InlineReposSecretScanningCe66fDeleteRequestJsonPostDeleteActionX2c3fb469? = null,
) {
  /**
   * The list of custom patterns to delete.
   */
  public val patterns: List<SecretScanningCustomPatternToDelete> = patterns.toList()

  public class Builder {
    private var patternsValue: List<SecretScanningCustomPatternToDelete>? = null

    public var patterns: List<SecretScanningCustomPatternToDelete>
      get() = requireNotNull(patternsValue) { "patterns is required" }
      set(`value`) {
        patternsValue = value
      }

    /**
     * What to do with alerts associated with the deleted patterns.
     * `delete_alerts` permanently removes the alerts.
     * `resolve_alerts` resolves the alerts as "pattern deleted".
     * Defaults to `delete_alerts` when not specified.
     */
    public var postDeleteAction:
        InlineReposSecretScanningCe66fDeleteRequestJsonPostDeleteActionX2c3fb469? = null

    public fun build(): InlineReposSecretScanningCustomPatternsDeleteRequestJsonX47902692 {
      check(patternsValue != null) { "patterns is required" }
      return InlineReposSecretScanningCustomPatternsDeleteRequestJsonX47902692(
        patterns = patterns,
        postDeleteAction = postDeleteAction,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposSecretScanningCustomPatternsDeleteRequestJsonX47902692 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineReposSecretScanningCustomPatternsDeleteRequestJsonX47902692> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposSecretScanningCustomPatternsDeleteRequestJsonX47902692 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposSecretScanningCustomPatternsDeleteRequestJsonX47902692")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposSecretScanningCustomPatternsDeleteRequestJsonX47902692 must be a JSON object")
      val patterns = json.decodeRequired<List<SecretScanningCustomPatternToDelete>>(rawObject, "patterns")
      return InlineReposSecretScanningCustomPatternsDeleteRequestJsonX47902692(
        patterns = patterns,
        postDeleteAction = rawObject["post_delete_action"]?.let { json.decodeFromJsonElement<InlineReposSecretScanningCe66fDeleteRequestJsonPostDeleteActionX2c3fb469>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposSecretScanningCustomPatternsDeleteRequestJsonX47902692) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposSecretScanningCustomPatternsDeleteRequestJsonX47902692")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("patterns", json.encodeToJsonElement(value.patterns))
        value.postDeleteAction?.let { put("post_delete_action", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposSecretScanningCustomPatternsDeleteRequestJsonX47902692(block: InlineReposSecretScanningCustomPatternsDeleteRequestJsonX47902692.Builder.() -> Unit): InlineReposSecretScanningCustomPatternsDeleteRequestJsonX47902692 = InlineReposSecretScanningCustomPatternsDeleteRequestJsonX47902692.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposSecretScanningCustomPatternsDeleteRequestJsonX47902692 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
