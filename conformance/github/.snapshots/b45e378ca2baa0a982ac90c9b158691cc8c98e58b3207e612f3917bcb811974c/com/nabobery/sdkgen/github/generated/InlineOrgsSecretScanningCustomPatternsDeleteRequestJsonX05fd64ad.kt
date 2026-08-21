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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1secret-scanning~1custom-patterns/delete/requestBody/content/applic
 * ation~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1secret-scanning~1custom-patterns/delete/requestBody/content/applic
 * ation~1json/schema
 */
@Serializable(with = InlineOrgsSecretScanningCustomPatternsDeleteRequestJsonX05fd64ad.Serializer::class)
public class InlineOrgsSecretScanningCustomPatternsDeleteRequestJsonX05fd64ad(
  patterns: List<SecretScanningCustomPatternToDelete>,
  /**
   * What to do with alerts associated with the deleted patterns.
   * `delete_alerts` permanently removes the alerts.
   * `resolve_alerts` resolves the alerts as "pattern deleted".
   * Defaults to `delete_alerts` when not specified.
   */
  public val postDeleteAction:
      InlineOrgsSecretScanningCustomPatternsDeleteRequestJsonPostDeleteActionX2c5b49e1? = null,
) {
  /**
   * The list of custom patterns to delete.
   */
  public val patterns: List<SecretScanningCustomPatternToDelete> = patterns.toList()

  public class Builder {
    private var patternsValue: List<SecretScanningCustomPatternToDelete>? = null

    public var patterns: List<SecretScanningCustomPatternToDelete>
      get() = requireNotNull(patternsValue) { "patterns is required" }.toList()
      set(`value`) {
        patternsValue = value.toList()
      }

    /**
     * What to do with alerts associated with the deleted patterns.
     * `delete_alerts` permanently removes the alerts.
     * `resolve_alerts` resolves the alerts as "pattern deleted".
     * Defaults to `delete_alerts` when not specified.
     */
    public var postDeleteAction:
        InlineOrgsSecretScanningCustomPatternsDeleteRequestJsonPostDeleteActionX2c5b49e1? = null

    public fun build(): InlineOrgsSecretScanningCustomPatternsDeleteRequestJsonX05fd64ad {
      check(patternsValue != null) { "patterns is required" }
      return InlineOrgsSecretScanningCustomPatternsDeleteRequestJsonX05fd64ad(
        patterns = patterns,
        postDeleteAction = postDeleteAction,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsSecretScanningCustomPatternsDeleteRequestJsonX05fd64ad = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsSecretScanningCustomPatternsDeleteRequestJsonX05fd64ad> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsSecretScanningCustomPatternsDeleteRequestJsonX05fd64ad {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsSecretScanningCustomPatternsDeleteRequestJsonX05fd64ad")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsSecretScanningCustomPatternsDeleteRequestJsonX05fd64ad must be a JSON object")
      val patterns = json.decodeRequired<List<SecretScanningCustomPatternToDelete>>(rawObject, "patterns")
      return InlineOrgsSecretScanningCustomPatternsDeleteRequestJsonX05fd64ad(
        patterns = patterns,
        postDeleteAction = rawObject["post_delete_action"]?.let { json.decodeFromJsonElement<InlineOrgsSecretScanningCustomPatternsDeleteRequestJsonPostDeleteActionX2c5b49e1>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsSecretScanningCustomPatternsDeleteRequestJsonX05fd64ad) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsSecretScanningCustomPatternsDeleteRequestJsonX05fd64ad")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("patterns", json.encodeToJsonElement(value.patterns))
        value.postDeleteAction?.let { put("post_delete_action", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsSecretScanningCustomPatternsDeleteRequestJsonX05fd64ad(block: InlineOrgsSecretScanningCustomPatternsDeleteRequestJsonX05fd64ad.Builder.() -> Unit): InlineOrgsSecretScanningCustomPatternsDeleteRequestJsonX05fd64ad = InlineOrgsSecretScanningCustomPatternsDeleteRequestJsonX05fd64ad.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsSecretScanningCustomPatternsDeleteRequestJsonX05fd64ad is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
