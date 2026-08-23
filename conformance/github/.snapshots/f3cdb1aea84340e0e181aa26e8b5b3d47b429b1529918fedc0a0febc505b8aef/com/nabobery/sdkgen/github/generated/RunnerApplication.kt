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
 * Runner Application
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/runner-application
 */
@Serializable(with = RunnerApplication.Serializer::class)
public class RunnerApplication(
  public val architecture: String,
  public val downloadUrl: String,
  public val filename: String,
  public val os: String,
  public val sha256Checksum: String? = null,
  /**
   * A short lived bearer token used to download the runner, if needed.
   */
  public val tempDownloadToken: String? = null,
) {
  public class Builder {
    private var architectureValue: String? = null

    public var architecture: String
      get() = requireNotNull(architectureValue) { "architecture is required" }
      set(`value`) {
        architectureValue = value
      }

    private var downloadUrlValue: String? = null

    public var downloadUrl: String
      get() = requireNotNull(downloadUrlValue) { "downloadUrl is required" }
      set(`value`) {
        downloadUrlValue = value
      }

    private var filenameValue: String? = null

    public var filename: String
      get() = requireNotNull(filenameValue) { "filename is required" }
      set(`value`) {
        filenameValue = value
      }

    private var osValue: String? = null

    public var os: String
      get() = requireNotNull(osValue) { "os is required" }
      set(`value`) {
        osValue = value
      }

    public var sha256Checksum: String? = null

    /**
     * A short lived bearer token used to download the runner, if needed.
     */
    public var tempDownloadToken: String? = null

    public fun build(): RunnerApplication {
      check(architectureValue != null) { "architecture is required" }
      check(downloadUrlValue != null) { "downloadUrl is required" }
      check(filenameValue != null) { "filename is required" }
      check(osValue != null) { "os is required" }
      return RunnerApplication(
        architecture = architecture,
        downloadUrl = downloadUrl,
        filename = filename,
        os = os,
        sha256Checksum = sha256Checksum,
        tempDownloadToken = tempDownloadToken,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): RunnerApplication = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<RunnerApplication> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): RunnerApplication {
      val jsonDecoder = decoder.requireJsonDecoder("RunnerApplication")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("RunnerApplication must be a JSON object")
      val architecture = json.decodeRequired<String>(rawObject, "architecture")
      val downloadUrl = json.decodeRequired<String>(rawObject, "download_url")
      val filename = json.decodeRequired<String>(rawObject, "filename")
      val os = json.decodeRequired<String>(rawObject, "os")
      return RunnerApplication(
        architecture = architecture,
        downloadUrl = downloadUrl,
        filename = filename,
        os = os,
        sha256Checksum = rawObject["sha256_checksum"]?.let { json.decodeFromJsonElement<String>(it) },
        tempDownloadToken = rawObject["temp_download_token"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: RunnerApplication) {
      val jsonEncoder = encoder.requireJsonEncoder("RunnerApplication")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("architecture", value.architecture)
        put("download_url", value.downloadUrl)
        put("filename", value.filename)
        put("os", value.os)
        value.sha256Checksum?.let { put("sha256_checksum", it) }
        value.tempDownloadToken?.let { put("temp_download_token", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun runnerApplication(block: RunnerApplication.Builder.() -> Unit): RunnerApplication = RunnerApplication.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("RunnerApplication is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
