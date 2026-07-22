package com.nabobery.sdkgen.generated.stripe

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
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1reporting~1report_runs/post/requestBody/content/application~1x-www-form-url
 * encoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1reporting~1report_runs/post/requestBody/content/application~1x-www-form-url
 * encoded/schema
 */
@Serializable(with = InlineV1ReportingReportRunsPostRequestFormX5dc1d0e3.Serializer::class)
public class InlineV1ReportingReportRunsPostRequestFormX5dc1d0e3(
    /**
     * The ID of the [report type](https://docs.stripe.com/reporting/statements/api#report-types) to run, such as
     * `"balance.summary.1"`.
     */
    public val reportType: String,
    /**
     * Specifies which fields in the response should be expanded.
     */
    public val expand: List<String>? = null,
    /**
     * Parameters specifying how the report should be run. Different Report Types have different required and optional
     * parameters, listed in the [API Access to Reports](https://docs.stripe.com/reporting/statements/api) documentation.
     */
    public val parameters: InlineV1ReportingReportRunsPostRequestFormParametersX2d2199bf? = null,
) {
    public class Builder {
        private var reportTypeValue: String? = null

        public var reportType: String
            get() = requireNotNull(reportTypeValue) { "reportType is required" }
            set(`value`) {
                reportTypeValue = value
            }

        /**
         * Specifies which fields in the response should be expanded.
         */
        public var expand: List<String>? = null

        /**
         * Parameters specifying how the report should be run. Different Report Types have different required and optional
         * parameters, listed in the [API Access to Reports](https://docs.stripe.com/reporting/statements/api)
         * documentation.
         */
        public var parameters: InlineV1ReportingReportRunsPostRequestFormParametersX2d2199bf? = null

        public fun build(): InlineV1ReportingReportRunsPostRequestFormX5dc1d0e3 {
            check(reportTypeValue != null) { "reportType is required" }
            return InlineV1ReportingReportRunsPostRequestFormX5dc1d0e3(
                reportType = reportType,
                expand = expand,
                parameters = parameters,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1ReportingReportRunsPostRequestFormX5dc1d0e3 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1ReportingReportRunsPostRequestFormX5dc1d0e3> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1ReportingReportRunsPostRequestFormX5dc1d0e3 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1ReportingReportRunsPostRequestFormX5dc1d0e3")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1ReportingReportRunsPostRequestFormX5dc1d0e3 must be a JSON object",
                    )
            val reportType = json.decodeRequired<String>(rawObject, "report_type")
            return InlineV1ReportingReportRunsPostRequestFormX5dc1d0e3(
                reportType = reportType,
                expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
                parameters =
                    rawObject["parameters"]?.let {
                        json.decodeFromJsonElement<InlineV1ReportingReportRunsPostRequestFormParametersX2d2199bf>(it)
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1ReportingReportRunsPostRequestFormX5dc1d0e3,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1ReportingReportRunsPostRequestFormX5dc1d0e3")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("report_type", value.reportType)
                    value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
                    value.parameters?.let { put("parameters", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1ReportingReportRunsPostRequestFormX5dc1d0e3(
    block: InlineV1ReportingReportRunsPostRequestFormX5dc1d0e3.Builder.() -> Unit,
): InlineV1ReportingReportRunsPostRequestFormX5dc1d0e3 =
    InlineV1ReportingReportRunsPostRequestFormX5dc1d0e3.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1ReportingReportRunsPostRequestFormX5dc1d0e3 is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
