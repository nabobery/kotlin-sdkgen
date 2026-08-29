package com.nabobery.sdkgen.github.generated

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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/snapshot/properties/job.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/snapshot/properties/job
 */
@Serializable(with = InlineSnapshotJobX37ac8ca3.Serializer::class)
public class InlineSnapshotJobX37ac8ca3(
  /**
   * Correlator provides a key that is used to group snapshots submitted over time. Only the "latest" submitted snapshot
   * for a given combination of `job.correlator` and `detector.name` will be considered when calculating a repository's
   * current dependencies. Correlator should be as unique as it takes to distinguish all detection runs for a given
   * "wave" of CI workflow you run. If you're using GitHub Actions, a good default value for this could be the
   * environment variables GITHUB_WORKFLOW and GITHUB_JOB concatenated together. If you're using a build matrix, then
   * you'll also need to add additional key(s) to distinguish between each submission inside a matrix variation.
   */
  public val correlator: String,
  /**
   * The external ID of the job.
   */
  public val id: String,
  /**
   * The url for the job.
   */
  public val htmlUrl: String? = null,
) {
  public class Builder {
    private var correlatorValue: String? = null

    public var correlator: String
      get() = requireNotNull(correlatorValue) { "correlator is required" }
      set(`value`) {
        correlatorValue = value
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    /**
     * The url for the job.
     */
    public var htmlUrl: String? = null

    public fun build(): InlineSnapshotJobX37ac8ca3 {
      check(correlatorValue != null) { "correlator is required" }
      check(idValue != null) { "id is required" }
      return InlineSnapshotJobX37ac8ca3(
        correlator = correlator,
        id = id,
        htmlUrl = htmlUrl,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineSnapshotJobX37ac8ca3 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineSnapshotJobX37ac8ca3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSnapshotJobX37ac8ca3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSnapshotJobX37ac8ca3")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineSnapshotJobX37ac8ca3 must be a JSON object")
      val correlator = json.decodeRequired<String>(rawObject, "correlator")
      val id = json.decodeRequired<String>(rawObject, "id")
      return InlineSnapshotJobX37ac8ca3(
        correlator = correlator,
        id = id,
        htmlUrl = rawObject["html_url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineSnapshotJobX37ac8ca3) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineSnapshotJobX37ac8ca3")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("correlator", value.correlator)
        put("id", value.id)
        value.htmlUrl?.let { put("html_url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineSnapshotJobX37ac8ca3(block: InlineSnapshotJobX37ac8ca3.Builder.() -> Unit): InlineSnapshotJobX37ac8ca3 = InlineSnapshotJobX37ac8ca3.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineSnapshotJobX37ac8ca3 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
