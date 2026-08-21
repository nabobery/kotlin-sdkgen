package com.nabobery.sdkgen.github.generated

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
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
 * Create a new snapshot of a repository's dependencies.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/snapshot
 */
@Serializable(with = Snapshot.Serializer::class)
public class Snapshot(
  /**
   * A description of the detector used.
   */
  public val detector: InlineSnapshotDetectorX656c3950,
  public val job: InlineSnapshotJobX37ac8ca3,
  /**
   * The repository branch that triggered this snapshot.
   */
  public val ref: String,
  /**
   * The time at which the snapshot was scanned.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val scanned: String,
  /**
   * The commit SHA associated with this dependency snapshot. Maximum length: 40 characters.
   */
  public val sha: String,
  /**
   * The version of the repository snapshot submission.
   */
  public val version: Int,
  manifests: Map<String, Manifest>? = null,
  metadata: Map<String, InlineMetadataAdditionalValueXa8c346f6?>? = null,
) {
  /**
   * A collection of package manifests, which are a collection of related dependencies declared in a file or
   * representing a logical group of dependencies.
   */
  public val manifests: Map<String, Manifest>? =
      manifests?.let { collection0 -> collection0.toMap() }

  public val metadata: Map<String, InlineMetadataAdditionalValueXa8c346f6?>? =
      metadata?.let { collection0 -> collection0.toMap() }

  public class Builder {
    private var detectorValue: InlineSnapshotDetectorX656c3950? = null

    public var detector: InlineSnapshotDetectorX656c3950
      get() = requireNotNull(detectorValue) { "detector is required" }
      set(`value`) {
        detectorValue = value
      }

    private var jobValue: InlineSnapshotJobX37ac8ca3? = null

    public var job: InlineSnapshotJobX37ac8ca3
      get() = requireNotNull(jobValue) { "job is required" }
      set(`value`) {
        jobValue = value
      }

    private var refValue: String? = null

    public var ref: String
      get() = requireNotNull(refValue) { "ref is required" }
      set(`value`) {
        refValue = value
      }

    private var scannedValue: String? = null

    public var scanned: String
      get() = requireNotNull(scannedValue) { "scanned is required" }
      set(`value`) {
        scannedValue = value
      }

    private var shaValue: String? = null

    public var sha: String
      get() = requireNotNull(shaValue) { "sha is required" }
      set(`value`) {
        shaValue = value
      }

    private var versionValue: Int? = null

    public var version: Int
      get() = requireNotNull(versionValue) { "version is required" }
      set(`value`) {
        versionValue = value
      }

    private var manifestsValue: Map<String, Manifest>? = null

    /**
     * A collection of package manifests, which are a collection of related dependencies declared in a file or
     * representing a logical group of dependencies.
     */
    public var manifests: Map<String, Manifest>?
      get() = manifestsValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        manifestsValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var metadataValue: Map<String, InlineMetadataAdditionalValueXa8c346f6?>? = null

    public var metadata: Map<String, InlineMetadataAdditionalValueXa8c346f6?>?
      get() = metadataValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        metadataValue = value?.let { collection0 -> collection0.toMap() }
      }

    public fun build(): Snapshot {
      check(detectorValue != null) { "detector is required" }
      check(jobValue != null) { "job is required" }
      check(refValue != null) { "ref is required" }
      check(scannedValue != null) { "scanned is required" }
      check(shaValue != null) { "sha is required" }
      check(versionValue != null) { "version is required" }
      return Snapshot(
        detector = detector,
        job = job,
        ref = ref,
        scanned = scanned,
        sha = sha,
        version = version,
        manifests = manifests,
        metadata = metadata,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): Snapshot = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<Snapshot> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): Snapshot {
      val jsonDecoder = decoder.requireJsonDecoder("Snapshot")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("Snapshot must be a JSON object")
      val detector = json.decodeRequired<InlineSnapshotDetectorX656c3950>(rawObject, "detector")
      val job = json.decodeRequired<InlineSnapshotJobX37ac8ca3>(rawObject, "job")
      val ref = json.decodeRequired<String>(rawObject, "ref")
      val scanned = json.decodeRequired<String>(rawObject, "scanned")
      val sha = json.decodeRequired<String>(rawObject, "sha")
      val version = json.decodeRequired<Int>(rawObject, "version")
      return Snapshot(
        detector = detector,
        job = job,
        ref = ref,
        scanned = scanned,
        sha = sha,
        version = version,
        manifests = rawObject["manifests"]?.let { json.decodeFromJsonElement<Map<String, Manifest>>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, InlineMetadataAdditionalValueXa8c346f6?>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: Snapshot) {
      val jsonEncoder = encoder.requireJsonEncoder("Snapshot")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("detector", json.encodeToJsonElement(value.detector))
        put("job", json.encodeToJsonElement(value.job))
        put("ref", value.ref)
        put("scanned", value.scanned)
        put("sha", value.sha)
        put("version", json.encodeToJsonElement(value.version))
        value.manifests?.let { put("manifests", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun snapshot(block: Snapshot.Builder.() -> Unit): Snapshot = Snapshot.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("Snapshot is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
