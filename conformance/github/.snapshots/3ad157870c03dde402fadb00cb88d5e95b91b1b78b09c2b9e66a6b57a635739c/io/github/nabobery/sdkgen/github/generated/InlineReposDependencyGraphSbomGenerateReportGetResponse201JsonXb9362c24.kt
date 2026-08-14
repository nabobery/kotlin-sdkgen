package io.github.nabobery.sdkgen.github.generated

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1dependency-graph~1sbom~1generate-report/get/responses/2
 * 01/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1dependency-graph~1sbom~1generate-report/get/responses/2
 * 01/content/application~1json/schema
 */
@Serializable(with = InlineReposDependencyGraphSbomGenerateReportGetResponse201JsonXb9362c24.Serializer::class)
public class InlineReposDependencyGraphSbomGenerateReportGetResponse201JsonXb9362c24(
  /**
   * URL to poll for the SBOM export result.
   */
  public val sbomUrl: String? = null,
) {
  public class Builder {
    /**
     * URL to poll for the SBOM export result.
     */
    public var sbomUrl: String? = null

    public fun build(): InlineReposDependencyGraphSbomGenerateReportGetResponse201JsonXb9362c24 = InlineReposDependencyGraphSbomGenerateReportGetResponse201JsonXb9362c24(
      sbomUrl = sbomUrl,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposDependencyGraphSbomGenerateReportGetResponse201JsonXb9362c24 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposDependencyGraphSbomGenerateReportGetResponse201JsonXb9362c24> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposDependencyGraphSbomGenerateReportGetResponse201JsonXb9362c24 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposDependencyGraphSbomGenerateReportGetResponse201JsonXb9362c24")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposDependencyGraphSbomGenerateReportGetResponse201JsonXb9362c24 must be a JSON object")
      return InlineReposDependencyGraphSbomGenerateReportGetResponse201JsonXb9362c24(
        sbomUrl = rawObject["sbom_url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposDependencyGraphSbomGenerateReportGetResponse201JsonXb9362c24) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposDependencyGraphSbomGenerateReportGetResponse201JsonXb9362c24")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.sbomUrl?.let { put("sbom_url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposDependencyGraphSbomGenerateReportGetResponse201JsonXb9362c24(block: InlineReposDependencyGraphSbomGenerateReportGetResponse201JsonXb9362c24.Builder.() -> Unit): InlineReposDependencyGraphSbomGenerateReportGetResponse201JsonXb9362c24 = InlineReposDependencyGraphSbomGenerateReportGetResponse201JsonXb9362c24.build(block)
